package com.marticus;

import org.springframework.stereotype.Component;

@Component
public class third {

	void SayHelloFrom3rd()
	{
		System.out.println("calling from third injected bean class");
	}
}
