package student.arrays;
import java.util.*;
public class ArrayOfPrimitives {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Write code here, to create and use an array of primitives.
		System.out.println("Enter no of elements");
		int [] array = new int[sc.nextInt()];
		int sum = 0; 
		int positive = 0;
		positive = getPositives(sc, array, positive);
		
		System.out.println("Sum of positive :"+sum+" and total positive digits is :"+positive);
		
		
	}

	private static int getPositives(Scanner sc, int[] array, int positive) {
		for (int i=0;i < array.length;i++)
		{
			System.out.println("Enter element "+(i+1)+" :");
			array[i] = sc.nextInt();
			//sum += Math.max(array[i], 0);
			if(array[i]>0)
				positive++;
			
		}
		return positive;
	}
}