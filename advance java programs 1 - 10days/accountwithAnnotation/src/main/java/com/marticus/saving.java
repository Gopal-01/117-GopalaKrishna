package com.marticus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("save")
@Scope("prototype")
public class saving {
	
	private current current;

	public current getCurrent() {
		return current;
	}

	public void setCurrent(current current) {
		this.current = current;
	}
	
	void saveacc()
	{
		System.out.println("saving");
	}
	 
	
	

}
