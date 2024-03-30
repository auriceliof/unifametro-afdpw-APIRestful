package com.unifametro.apirestful.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Instant bihtDate;
	private Double income;
	
	public Student(Long id, String name, String cpf, Instant bihtDate, Double income) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.bihtDate = bihtDate;
		this.income = income;
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

	public Instant getBihtDate() {
		return bihtDate;
	}

	public void setBihtDate(Instant bihtDate) {
		this.bihtDate = bihtDate;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id);
	}	
}










