package com.homework.docker.v03.controller;

import com.homework.docker.v03.dto.DeptResponseDto;
import com.homework.docker.v03.dto.DeptSaveRequestDto;
import com.homework.docker.v03.service.DeptService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class DeptController {
    private final DeptService memberService;

    @PostMapping("/dept/post")
    public ResponseEntity<DeptResponseDto> saveMember(@RequestBody DeptSaveRequestDto requestDto) {
        DeptResponseDto member = memberService.save(requestDto);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

    @GetMapping("/dept/{id}")
    public ResponseEntity<DeptResponseDto> getDept(@PathVariable Long id){
        DeptResponseDto deptMember = memberService.findById(id);
        if(deptMember == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(deptMember);
    }
}
