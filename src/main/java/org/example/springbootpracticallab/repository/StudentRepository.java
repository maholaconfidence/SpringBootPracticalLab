package org.example.springbootpracticallab.repository;
import com.springbootpracticallab.crtd.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartmentId(Long departmentId);
}


