package student.javalang;

import java.math.*;
import java.util.*;
public class Optional {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		i&= i-1;
		System.out.println(i);
		
		int x=sc.nextInt();
		int count=0;
		while(x!=0)
		{
			x&=x-1;
			count++;
		}
		System.out.println(count);
	}
	
	
}
