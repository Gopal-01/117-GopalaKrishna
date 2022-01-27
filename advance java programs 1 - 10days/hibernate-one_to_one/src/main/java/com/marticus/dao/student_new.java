package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class student_new {
	
	
	
	private long studentId;
	private String Studentname;
	

	private Set<coachingcenter> studentcoachingcenters = new HashSet<coachingcenter>(0);
	
	
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public long getStudentId() {
		return studentId;
	}
	
	
	public student_new() {
	}

	public student_new(String studentname,Set<coachingcenter> studentcoachingcenters) {
	this.studentcoachingcenters = studentcoachingcenters;
	this.Studentname = studentname;
	}
	
	


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COACH", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COACH_ID") })
	public Set<coachingcenter> getStudentcoachingcenters() {
		return studentcoachingcenters;
	}

	public void setStudentcoachingcenters(Set<coachingcenter> studentcoachingcenters) {
		this.studentcoachingcenters = studentcoachingcenters;
	}

}
