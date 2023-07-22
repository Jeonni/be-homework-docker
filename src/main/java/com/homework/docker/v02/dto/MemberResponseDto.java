package com.homework.docker.v02.dto;

import com.homework.docker.v02.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {
    private Long sabun;
    private String name;
    private String dept_cd;
    private String dept_nm;
    private String role_cd;
    private String role_nm;

    public MemberResponseDto(Member entity) {
        this.sabun = entity.getSabun();
        this.name = entity.getName();
        this.dept_cd = entity.getDept_cd();
        this.dept_nm = entity.getDept_nm();
        this.role_cd = entity.getRole_cd();
        this.role_nm = entity.getRole_nm();
    }
}