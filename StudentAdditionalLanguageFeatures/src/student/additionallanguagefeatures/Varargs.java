package student.additionallanguagefeatures;

public class Varargs {

	public static void main(String[] args) {

		// Write your code here, to explore the use of variable-argument-list methods.
		
		System.out.println("SUm is :"+ sum(2) );
		
	}
	public static double sum(double a,double... b )
	{
		double sum = a;
		
		for(double iter: b)
		{
			sum+=iter;
		}
		
		return sum;
	}

}
