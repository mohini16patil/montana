package student.arrays;

import java.util.*;

//Product class, just used in this file.
class Product {

	private String name;
	private double unitPrice;

	public Product(String name, double unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return String.format("%s %.2f", name, unitPrice);
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {

		// Write code here, to create and use an array of Product objects.

		System.out.println("How many products do you want");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Product[] parray = new Product[n];

		for (int i = 0; i < n; i++) {
	
			System.out.println("Enter name and unitprice of product");
			parray[i]= new Product(sc.next(),sc.nextInt());
				
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Product"+(i+1)+":"+parray[i].toString());
		}

	}
}