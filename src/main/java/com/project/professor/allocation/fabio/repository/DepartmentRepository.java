package com.project.professor.allocation.fabio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.professor.allocation.fabio.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
