package student.classes;

public class UseEmployee {

	public static void main(String[] args) {
		
		Employee.setStatutorySalary(8000);

		// Write code to test your Employee class here.
		Employee e = new Employee("Eashan", 120);
		String [] skills = {"Web-Dev","Backend-Dev"};
		e.setSkills(skills);
		Employee e1 = new Employee("Varad");
		
		
		e.payRise(1000);
		e.payBonus();
		e1.payBonus(5);
		
		e.empToString();
		e.printSkills();
		System.out.println("");
		e1.empToString();

	}

}
