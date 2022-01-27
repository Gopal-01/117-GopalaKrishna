package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "account")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="account") 

public class account {

@Id  
@GeneratedValue(strategy=GenerationType.AUTO)

@Column(name = "id")
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Column(name="accono")
private int accno;

@Column(name = "name")
private String name;
	
	
	
	
}
