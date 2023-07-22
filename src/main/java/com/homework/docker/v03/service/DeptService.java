package com.homework.docker.v03.service;

import com.homework.docker.v03.dto.DeptResponseDto;
import com.homework.docker.v03.dto.DeptSaveRequestDto;
import com.homework.docker.v03.entity.Dept;
import com.homework.docker.v03.repository.DeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class DeptService {
    private final DeptRepository memberRepository;

    @Transactional
    public DeptResponseDto save(DeptSaveRequestDto requestDto) {
        Dept member = memberRepository.save(requestDto.toEntity());
        return new DeptResponseDto(member);
    }

    public DeptResponseDto findById(Long id) {
        Dept entity = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Member Not Found"));
        return new DeptResponseDto(entity);
    }
}