package student.collectionsgenerics;

import java.util.Comparator;
public class ComparisonMethods  {

	// TODO Write a method compare that takes two Comparable values and returns 
	// TODO the greater of them
	
	public static <T extends Comparable<T>> T compare(T a, T b)
	{
		return a.compareTo(b)>=0 ? a:b;	
		
	}
	// TODO Write a method compare that takes any two values and a compatible 
	// TODO Comparator, and uses the Comparator to return the greater of them
	public static <T> T compare (T a,T b, Comparator<T> comparator){
		return comparator.compare(a, b)>=0? a:b;
	}
	
	
    public static void main(String[] args) {
		// use the natural ordering on ints (ascending numeric)
		System.out.println("compare works with natural ordering on Integer: " + (compare(2,3) == 3));		
		System.out.println("compare works with natural ordering on String: " + compare("a1","b").equals("b"));		
		System.out.println("compare works with ordering by length on String: " + 
				compare("a1","b", new StringLengthComparator()).equals("a1"));		
	}

}

// TODO write a class StringLengthComparator that orders strings in increasing order of length
//class StringLengthComparator ...
class StringLengthComparator implements Comparator<String>{
	
	@Override
	public int compare(String o1, String o2){
		{
							
			return (o1.length() > o2.length())?1:-1;
				
		}
	}
}