package student.additionallanguagefeatures;

import static org.junit.Assert.*;

import org.junit.Test;

public class Varargstest {

	@Test
	public void testExactly2() {
		
		assertEquals(4,Varargs.sum(2,2),0.01);
	}
	
	@Test
	public void test1() {
		
		assertEquals(2,Varargs.sum(2),0.01);
	}
	@Test
	public void testMoreThan2() {
		
		assertEquals(10,Varargs.sum(2,2,6),0.01);
	}
	

}
