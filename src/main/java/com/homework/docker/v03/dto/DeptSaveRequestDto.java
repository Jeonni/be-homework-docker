package com.homework.docker.v03.dto;

import com.homework.docker.v03.entity.Dept;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeptSaveRequestDto {
    private String dept_cd;
    private String dept_nm;
    private Integer level;
    private String rel_dept_cd;
    private String rel_dept_nm;


    @Builder
    public DeptSaveRequestDto(String dept_cd, String dept_nm, Integer level, String rel_dept_cd, String rel_dept_nm) {
        this.dept_cd = dept_cd;
        this.dept_nm = dept_nm;
        this.level = level;
        this.rel_dept_cd = rel_dept_cd;
        this.rel_dept_nm = rel_dept_nm;
    }

    public Dept toEntity() {
        return Dept.builder()
                .dept_cd(dept_cd)
                .dept_nm(dept_nm)
                .level(level)
                .rel_dept_cd(rel_dept_cd)
                .rel_dept_nm(rel_dept_nm)
                .build();
    }
}
