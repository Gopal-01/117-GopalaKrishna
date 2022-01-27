package com.marticus.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class person {

	private int studentId;
	private String studentName;
	private aadhar personAadhar;
	
	
	public person() {
	}

	public person(String studentName, aadhar personAadhar) {
		this.studentName = studentName;
		this.personAadhar = personAadhar;
	}
	@Id
	@GeneratedValue
	@Column(name = "personid")
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Column(name = "personname", nullable = false, length = 100)
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@OneToOne(cascade = CascadeType.ALL)
	public aadhar getPersonAadhar() {
		return personAadhar;
	}

	public void setPersonAadhar(aadhar personAadhar) {
		this.personAadhar = personAadhar;
	}
	
	
	
	

}
