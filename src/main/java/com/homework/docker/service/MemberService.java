package com.homework.docker.service;

import com.homework.docker.dto.MemberResponseDto;
import com.homework.docker.dto.MemberSaveRequestDto;
import com.homework.docker.entity.Member;
import com.homework.docker.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponseDto save(MemberSaveRequestDto requestDto) {
        Member member = memberRepository.save(requestDto.toEntity());
        return new MemberResponseDto(member);
    }

    public MemberResponseDto findById(Long sabun) {
        Member entity = memberRepository.findById(sabun).orElseThrow(() -> new IllegalArgumentException("Member Not Found"));
        return new MemberResponseDto(entity);
    }
}