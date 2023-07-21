package com.homework.docker.controller;

import com.homework.docker.dto.MemberResponseDto;
import com.homework.docker.dto.MemberSaveRequestDto;
import com.homework.docker.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class MemberController {
    private final MemberService memberService;

    @GetMapping(value = "/hello")
    public String rootAPI() {
        return "Hello Docker!";
    }

    @PostMapping("/post")
    public ResponseEntity<MemberResponseDto> saveMember(@RequestBody MemberSaveRequestDto requestDto) {
        MemberResponseDto member = memberService.save(requestDto);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

    @GetMapping("/member/{sabun}")
    public ResponseEntity<MemberResponseDto> getMember(@PathVariable Long sabun) {
        MemberResponseDto member = memberService.findById(sabun);
        if (member == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(member);
    }
}
