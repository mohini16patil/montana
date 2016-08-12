package student.classes;

import java.util.*;
// Write your Employee class here.

public class Employee {

	private String name;
	private float salary;
	private Date joiningDate;
	private String [] skills;
	private static int maxSkills = 10;
	private static float statutorySalary;


	public String[] getSkills() {
		return skills;
	}
	public void printSkills()
	{
		for(int i=0;i<skills.length;i++)
		{
			System.out.println(skills[i]);
		}
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	Employee(String name) {
		this(name, statutorySalary);
	}

	Employee(String name, float salary) {
		setName(name);
		setSalary(salary);
		this.joiningDate = new Date();
	}

	public static void setStatutorySalary(float ssalary) {
		statutorySalary = ssalary;
	}

	public static float getStatutorySalary() {
		return statutorySalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(float salary) {
		this.salary = Math.max(salary, statutorySalary);
	}

	public String getName() {
		return this.name;
	}

	public float getSalary() {
		return this.salary;
	}

	public void payRise(float rise) {
		this.salary += rise;
	}

	public void payBonus() {
		this.salary *= 1.01;
	}

	public void payBonus(float percent) {
		this.salary *= (1 + (float) (percent / 100));
	}

	public void payBonus(float percent, float min, float max) {
		if (this.salary > min && this.salary < max) {
			this.salary = this.salary * (1 + (float) (percent / 100));
		}
	}

	public void empToString() {
		System.out.println("Employee Name :" + this.name);
		System.out.println("Employee Salary:" + this.salary);
		System.out.println("Employee Joining Date :" + this.joiningDate);

	}

}