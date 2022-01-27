package com.javatpoint.mypackage;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="accsave")  
@PrimaryKeyJoinColumn(name="ID")  
public class acc_save extends account{

    @Column(name="interest")
	private int interest;

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}
}
