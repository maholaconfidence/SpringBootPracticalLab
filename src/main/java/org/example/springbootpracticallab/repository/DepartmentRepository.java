package org.example.springbootpracticallab.repository;

import org.example.springbootpracticallab.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
