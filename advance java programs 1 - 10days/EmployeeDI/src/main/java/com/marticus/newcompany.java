package com.marticus;

public class newcompany {
     
	private account acc;

	public account getAcc() {
		return acc;
	}

	public void setAcc(account acc) {
		this.acc = acc;
	}
	
	public void withdraw()
	{
	   acc.withDrawMoney();
	}
}
