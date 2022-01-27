package com.jutility;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatortest {

	@Test
	public void addtest()
	{
		calculator c = new calculator();
		assertTrue(c.add(2,5)==7);
	}
	@Test
	public void subtest()
	{
		calculator c = new calculator();
		assertTrue(c.sub(10,2)==4);
	}
	@Test
	public void multest()
	{
		calculator c = new calculator();
		assertTrue(c.mul(5, 2)==10);
	}

}
