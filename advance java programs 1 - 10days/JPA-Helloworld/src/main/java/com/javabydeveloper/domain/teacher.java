package com.javabydeveloper.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="teacher")
@Entity(name = "tecr")
public class teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "ID")
	private Long teacherId;

	@Column(name = "FNAME")
	private String Name;
	
	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public String getDegreename() {
		return degreename;
	}

	public void setDegreename(String degreename) {
		this.degreename = degreename;
	}

	@Column(name = "SUBJECT")
	private String subjectname;

	@Column(name = "DEGREE")
	private String degreename;


	
}
