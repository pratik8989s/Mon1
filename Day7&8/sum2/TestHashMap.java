package sum2;

import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student s=new Student();
		s.setNames();
		
		System.out.println("Printing whole object");
		System.out.println(s);
		System.out.println("**********************************");
		
		
		
		
		System.out.println("Printing only names");
		s.printNames();
		System.out.println("**********************************");
		
		
		
		System.out.println("Printing name via passing key");
		System.out.println("please give the key");
		String a=input.next();
		s.getName(a);
		System.out.println("**********************************");
		
		
		
		System.out.println("Now printing size");
		s.printSize();
		System.out.println("**********************************");
		
		System.out.println("printing all keys");
		s.printNamesKeySet();
		
		
		System.out.println("**********************************");
		System.out.println("Enter the number to remove");
		String b=input.next();
		
	s.remove(b);
	System.out.println(s);
/*	System.out.println("**********************************");

	System.out.println("Printing whole object");
	System.out.println(s);
		*/
	

	}

}
