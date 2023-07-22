package com.homework.docker.v03.entity;

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
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dept_cd;
    private String dept_nm;
    private Integer level;
    private String rel_dept_cd;
    private String rel_dept_nm;

    @Builder
    public Dept(Long id, String dept_cd, String dept_nm, Integer level, String rel_dept_cd, String rel_dept_nm) {
        this.id = id;
        this.dept_cd = dept_cd;
        this.dept_nm = dept_nm;
        this.level = level;
        this.rel_dept_cd = rel_dept_cd;
        this.rel_dept_nm = rel_dept_nm;
    }
}
