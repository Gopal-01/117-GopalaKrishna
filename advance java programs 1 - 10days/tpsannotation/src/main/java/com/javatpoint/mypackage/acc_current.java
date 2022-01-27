package com.javatpoint.mypackage;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="acccurrent")  
@PrimaryKeyJoinColumn(name="ID")  
public class acc_current extends account {
	
    @Column(name="odraftamount")
	private int odm;

	public int getOdm() {
		return odm;
	}

	public void setOdm(int odm) {
		this.odm = odm;
	}
	

}
