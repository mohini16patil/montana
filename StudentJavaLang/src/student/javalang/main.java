package student.javalang;
import solution.javalang.Employee;
import java.util.*;

public class main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an employee's name and his salary");
		String Empl = sc.nextLine();
		double sal = sc.nextDouble();
		//calling employee class object
		Employee e = new Employee(Empl,sal);
		System.out.println("Hello"+e.getName()+" Your salary is "+e.getSalary());

		System.out.println("Enter your colleague's name and his salary");
		String Empl2 = sc.next();
		double sal2 = sc.nextDouble();		
		Employee e2 = new Employee(Empl2,sal2);

		System.out.println("Hello"+e.getName()+" Your salary is "+e.getSalary());
		double avg =  ((e.getSalary()+ e2.getSalary())/2);
		System.out.println("Average salary of you and your colleague is "+avg);


		/*
		//Employee details
		
		System.out.println("Enter an employee's name and his salary");
		String Employee = sc.nextLine();
		int salary = sc.nextInt();
		System.out.println("Hello"+Employee+" Your salary is "+salary);
		//Colleague's details
		
		System.out.println("Enter your colleague's name and his salary");
		String Employee2 = sc.nextLine();
		int salary2 = sc.nextInt();		
		System.out.println("Hello"+Employee2+" Your salary is "+salary2);
		int avg = (salary+salary2)/2;
		System.out.println("Average salary of you and your colleague is "+avg);
		*/
		
		sc.close();

	}
}
