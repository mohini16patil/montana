package student.collectionsgenerics;

import java.util.Arrays;
import java.util.List;

public class GenericMethodUse {
	
	// TODO Write a method sum that returns the sum of a list of numbers, as a double	
		public static double sum(List<? extends Number> numbers)
		{
			double sum = 0.0;
			for(Number el:numbers)
			{
				sum+=el.doubleValue();
			}
			return sum;
		}
	
	// TODO Write a method middle that returns the middle element of any list 
	// – use the get method of list to retrieve the element at index (len - 1)/2)
		public static <T> T middle(List<T> list)
		{
			return list.get((list.size()-1)/2);
			
		}
	
	// TODO uncomment this main method and use it for testing
	// Do not change code in this method 
	
    public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4);
		List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
		List<String> stringList = Arrays.asList("a", "b", "c");
		
		double sumOfInts = GenericMethodUse.sum(intList);
		System.out.println("ints summed correctly: " + (sumOfInts == 10));
		double sumOfDoubles = sum(doubleList);
		System.out.println("doubles summed correctly: " + (sumOfDoubles == 7.5));
		
		int middleInt = GenericMethodUse.middle(intList);
		System.out.println("middle works on intList: " + (middleInt == 2));
		String middleString = GenericMethodUse.middle(stringList);
		System.out.println("middle works on stringList: " + (middleString.equals("b")));
	}

}
