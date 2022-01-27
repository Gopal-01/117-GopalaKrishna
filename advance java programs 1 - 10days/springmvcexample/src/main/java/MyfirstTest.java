import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyfirstTest {

	
	int i = 18;
	@Before
	public void check()
	{
		System.out.println("age"+age);
	}
	
	@Test
	public void checkadult() {


		assert(i>20); 
		
	}
	
	
	
	
	
	
	
//	@Test
//	public void test() {
//	//fail("Not yet implemented");
//		
//	}

//	@Test
//	public void agecheck() {
//	//fail("Not yet implemented");
//		int age = 18;
//		assert(age>16);
//	}
//	@Test
//	public void nullcheck() {
//	//fail("Not yet implemented");
//		int i = 18;
//		int j = 10;
//		
//		//assertEquals("checking i and j variables for equals",i,j);
//		assertNull(i);
//	}
    
	
//	@Test
//	public void notnull() {
//
//		//int i = 18;
//		int j = 10;
//		
//		assertNotNull(j);
//		
//	}
	
//	@Test
//	public void stringequalccheck() {
//
//		String a = "gopal";
//		String b = a;
//		
//		assertEquals(a,b);
//		
//	}
	
}
