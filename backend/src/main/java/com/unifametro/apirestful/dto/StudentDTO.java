package com.unifametro.apirestful.dto;

import java.io.Serializable;
import java.time.Instant;

import com.unifametro.apirestful.entities.Student;

public class StudentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Instant birthDate;
	private Double income;
	
	public StudentDTO() {
		
	}

	public StudentDTO(Long id, String name, String cpf, Instant birthDate, Double income) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.income = income;
	}
	
	public StudentDTO(Student entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		birthDate = entity.getBirthDate();
		income = entity.getIncome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
}
























