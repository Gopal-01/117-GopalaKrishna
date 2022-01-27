import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sampletest {

	int age =0;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("after class");
		
	}

	@Before
	public void setUp() throws Exception {
		
		System.out.println("before setup");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("after teardown");
	}

	@Test
	public void testage() {
		int age =20;
		assert(age>18);
		System.out.println("befofre age test");
	}

	@Test
	public void testequal() {
		int i =20;
		int j = i;
		assertEquals(i,j);
		System.out.println("equal test method");
	}

}
