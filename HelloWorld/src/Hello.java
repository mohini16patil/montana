import java.util.*;
import java.io.*;
public class Hello {

	public static void main(String [] args)
	{

		File f= new File("C:\\Users\\Grad138\\workspace\\HelloWorld\\src\\Hello.java");
		long len =  f.length();
		
		//System.out.println("File is " + len+ "bytes long");
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(", I am eashan");
		System.out.println(sb);
		
	}
}
