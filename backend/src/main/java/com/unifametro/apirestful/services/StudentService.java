package com.unifametro.apirestful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifametro.apirestful.entities.Student;
import com.unifametro.apirestful.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public List<Student> findAll(){
		
		return repository.findAll();
	}
}
