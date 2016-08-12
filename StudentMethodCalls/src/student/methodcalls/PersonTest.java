package student.methodcalls;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testCopyValues() {
		Person p1 = new Person();
		p1.setNameAge("Eashan",32);
		Person p2 = new Person();
		p1.PersonCopy(p2);
		Assert.assertTrue(p1.getName().equals(p2.getName()) && p1.getAge() == p2.getAge());
	
	}

}
