package com.homework.docker.v03.repository;

import com.homework.docker.v03.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
}
