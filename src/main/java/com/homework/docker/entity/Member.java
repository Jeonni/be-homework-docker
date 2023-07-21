package com.homework.docker.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sabun;
    private String name;
    private String dept_cd;
    private String dept_nm;
    private String role_cd;
    private String role_nm;

    @Builder
    public Member(String name, String dept_cd, String dept_nm, String role_cd, String role_nm) {
        this.name = name;
        this.dept_cd = dept_cd;
        this.dept_nm = dept_nm;
        this.role_cd = role_cd;
        this.role_nm = role_nm;
    }
}
