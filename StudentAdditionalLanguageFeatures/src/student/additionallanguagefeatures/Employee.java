

package student.additionallanguagefeatures;



import java.util.*;
// Write your Employee class here.
enum ContractType {
	FT("Full Time"),
	PT("Part Time"),
	C(" Casual");
	
	public  String type;
	ContractType(String type)
	{
		this.type = type;
	}
	
};
public class Employee {

	private String name;
	private float salary;
	private Date joiningDate;
	private String [] skills;
	private static int maxSkills = 10;
	private static float statutorySalary;
	private ContractType contractType;


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


	Employee(String name,ContractType ctype) {
		this(name, statutorySalary,ctype);
	}

	Employee(String name, float salary, ContractType ctype) {
		setName(name);
		setSalary(salary);
		this.joiningDate = new Date();
		this.contractType = ctype;
	}

	public String getContractType()
	{
		return this.contractType.type;
	}
	public void printContractType()
	{
		System.out.println("Contract type :"+ this.contractType.type);
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

	

	
	