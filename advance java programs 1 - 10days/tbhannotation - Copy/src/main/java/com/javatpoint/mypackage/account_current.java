package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("currentaccount")
public class account_current extends account{

	@Column(name="overdreaftamount")
	private int overdraftamount;

	public int getOverdraftamount() {
		return overdraftamount;
	}

	public void setOverdraftamount(int overdraftamount) {
		this.overdraftamount = overdraftamount;
	}
}
