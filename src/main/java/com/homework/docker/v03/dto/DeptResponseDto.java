package com.homework.docker.v03.dto;

import com.homework.docker.v03.entity.Dept;

import lombok.Getter;

@Getter
public class DeptResponseDto {
    private Long id;
    private String dept_cd;
    private String dept_nm;
    private Integer level;
    private String rel_dept_cd;
    private String rel_dept_nm;

    public DeptResponseDto(Dept entity) {
        this.id = entity.getId();
        this.dept_cd = entity.getDept_cd();
        this.dept_nm = entity.getDept_nm();
        this.level = entity.getLevel();
        this.rel_dept_cd = entity.getRel_dept_cd();
        this.rel_dept_nm = entity.getRel_dept_nm();
    }
}
