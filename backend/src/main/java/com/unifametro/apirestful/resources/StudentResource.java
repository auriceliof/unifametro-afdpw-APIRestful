package com.unifametro.apirestful.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifametro.apirestful.entities.Student;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll(){
		List<Student> list = new ArrayList<>();
		
			list.add(new Student(1L, "Auricelio", "123.456.789-00",  null, 15049.0));
			list.add(new Student(2L, "Miguel", "123.456.789-00",  null, 20149.0));
			list.add(new Student(3L, "Matheus", "123.456.789-00",  null, 13049.0));
			list.add(new Student(4L, "Rafel", "123.456.789-00",  null, 13049.0));
		
		return ResponseEntity.ok().body(list);
	}
}
