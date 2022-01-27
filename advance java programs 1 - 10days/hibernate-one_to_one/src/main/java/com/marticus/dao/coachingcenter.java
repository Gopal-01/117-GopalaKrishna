package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coachingcenter")
public class coachingcenter {

	private int id;
	private String name;
	private String sub;
	
	public coachingcenter () {
	}

	public coachingcenter(String name, String sub) {
	this.name = name;
	this.sub = sub;
	}

	@Id
	@GeneratedValue
	@Column(name = "COACH_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "COACH_NAME", nullable = false, length=100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	@Column(name = "COACH_SUB", nullable = false, length=15)
	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	
}
