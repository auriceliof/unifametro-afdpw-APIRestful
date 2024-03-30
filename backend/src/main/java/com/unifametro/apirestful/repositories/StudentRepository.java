package com.unifametro.apirestful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifametro.apirestful.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
