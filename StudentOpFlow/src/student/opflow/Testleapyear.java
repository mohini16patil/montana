package student.opflow;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Testleapyear {

	@Test
	public void testIsNotDivisibleByFour() {
		Assert.assertFalse(Program.isLeapYear(2001));

	}
	@Test
	public void testIsNotDivisibleByFourhundred() {
		Assert.assertFalse(Program.isLeapYear(1800));

	}

}
