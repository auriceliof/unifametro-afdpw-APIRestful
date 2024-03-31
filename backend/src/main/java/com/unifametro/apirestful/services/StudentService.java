package com.unifametro.apirestful.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unifametro.apirestful.dto.StudentDTO;
import com.unifametro.apirestful.entities.Student;
import com.unifametro.apirestful.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Transactional(readOnly = true)
	public List<StudentDTO> findAll(){
		
		List<Student> list = repository.findAll();
		
		return list.stream().map(x -> new StudentDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public StudentDTO findById(Long id) {

		Optional<Student> obj = repository.findById(id);
		Student entity = obj.get();
		
		return new StudentDTO(entity);
	}
}















