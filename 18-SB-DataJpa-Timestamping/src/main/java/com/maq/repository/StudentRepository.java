package com.maq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}