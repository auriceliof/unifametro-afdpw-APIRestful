package com.unifametro.apirestful.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unifametro.apirestful.dto.StudentDTO;
import com.unifametro.apirestful.entities.Student;
import com.unifametro.apirestful.repositories.StudentRepository;
import com.unifametro.apirestful.services.exceptions.ResourceNotFoundException;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Transactional(readOnly = true)
	public Page<StudentDTO> findAllPaged(Pageable pageable){
		
		Page<Student> list = repository.findAll(pageable);
		
		return list.map(x -> new StudentDTO(x));
	}

	@Transactional(readOnly = true)
	public StudentDTO findById(Long id) {

		Optional<Student> obj = repository.findById(id);
		
		Student entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		
		return new StudentDTO(entity);
	}

	@Transactional
	public StudentDTO insert(StudentDTO dto) {

		Student entity = new Student();
		
			entity.setName(dto.getName());
			entity.setCpf(dto.getCpf());
			entity.setBirthDate(dto.getBirthDate());
			entity.setIncome(dto.getIncome());
		
		entity = repository.save(entity);
		
		return new StudentDTO(entity);
	}

	@Transactional
	public StudentDTO update(Long id, StudentDTO dto) {
		try {
			Student entity = repository.getReferenceById(id);
			
				entity.setName(dto.getName());
				entity.setCpf(dto.getCpf());
				entity.setBirthDate(dto.getBirthDate());
				entity.setIncome(dto.getIncome());
			
			entity = repository.save(entity);
			
			return new StudentDTO(entity);			
		}
		catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException("ID not found" + id);
		}
	}

	public void delete(Long id) {
		try {
				repository.deleteById(id);	
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("ID not found" + id);
		}
	}
}
















