package com.homework.docker.v02.controller;

import com.homework.docker.v02.dto.MemberResponseDto;
import com.homework.docker.v02.dto.MemberSaveRequestDto;
import com.homework.docker.v02.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member/post")
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