package com.homework.docker.dto;

import com.homework.docker.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSaveRequestDto {
    private String name;
    private String dept_cd;
    private String dept_nm;
    private String role_cd;
    private String role_nm;

    @Builder
    public MemberSaveRequestDto(String name, String dept_cd, String dept_nm, String role_cd, String role_nm) {
        this.name = name;
        this.dept_cd = dept_cd;
        this.dept_nm = dept_nm;
        this.role_cd = role_cd;
        this.role_nm = role_nm;
    }

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .dept_cd(dept_cd)
                .dept_nm(dept_nm)
                .role_cd(role_cd)
                .role_nm(role_nm)
                .build();
    }
}
