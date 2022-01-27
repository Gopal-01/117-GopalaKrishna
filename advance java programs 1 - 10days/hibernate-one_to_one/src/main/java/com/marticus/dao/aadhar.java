package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aadhar")
public class aadhar {


	private int Id;
	private String number1;
	
	
	public aadhar() {
	}

	public aadhar(String number1) {
		this.number1 = number1;
		
	}
	@Id
	@GeneratedValue
	@Column(name = "aadharid")
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	@Column(name = "aadharnumber", nullable = false, length=250)
	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}
}
