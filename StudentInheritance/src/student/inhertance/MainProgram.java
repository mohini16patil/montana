package student.inhertance;

import java.util.ArrayList;

public class MainProgram {

	public static void main(String[] args) {

		// Write code here, to test the functionality of the library system.
		Member m1 = new Member("Eashan", 21);
		Member m2 = new Member("Varad", 17);
		Member m3 = new Member("Varun",5);
		
		ArrayList<Item> ilist = new ArrayList<Item>();
		ilist.add(new DVD("Donnie Darko",Genre.A,159));
		ilist.add(new Book("Atlas Shrugged",1234,"Ayn Rand",Genre.F));
		ilist.add(new Book("Pinochio",1235,"Blah",Genre.C));

		
		System.out.println(ilist.get(0).toString());
		System.out.println("");

		System.out.println((ilist.get(0).borrowItemBy(m2))?("Item "+ilist.get(0).Title+ " Borrowed by "+m2.getName()):("Couldn't borrow Item "+ilist.get(2).Title));
		System.out.println((ilist.get(0).borrowItemBy(m1))?("Item "+ilist.get(0).Title+" Borrowed by "+m1.getName()):("Couldn't borrow Item"+ilist.get(2).Title));
		System.out.println((ilist.get(2).borrowItemBy(m3))?("Item "+ilist.get(2).Title+" Borrowed by "+m3.getName()):("Couldn't borrow Item "+ilist.get(2).Title));

		System.out.println("");
		System.out.println(ilist.get(0).toString());


	}
}
