package student.classes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class emptest {

	@Test
	public void testBonus() {
		
		Employee emp1 = new Employee("Eas",9000);
		emp1.payBonus();
		Assert.assertEquals(emp1.getSalary(),9090,0.001);
	}
	

}
