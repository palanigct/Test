package Test;



import static org.junit.Assert.*;

import org.junit.Test;

public class JunitJenkinTest {
	
	@Test
	public void testpass() {
		int a=1;
		int b=2;
		assertEquals(a+b, 3);
	}
	
	

	@Test
	public void testfail() {
		int a=1;
		int b=2;
		assertEquals(a+b, 3);
	}
	
	@Test
	public void testfail2() {
		int a=1;
		int b=2;
		assertEquals(a+b, 3);
	}

}
