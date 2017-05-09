package sum4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentSortDemo {

	public static void main(String[] args) {

		ArrayList<Student> a = new ArrayList<Student>();
		
		/*a.add(new Student(23, "Pooja"));
		a.add(new Student(24, "Bikram"));
		a.add(new Student(25, "Varsha"));*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter roll no then name");
		for (int i = 0; i < 5; i++) {
			
			int r=input.nextInt();
			String n=input.next();
		
			a.add(new Student(r, n));
		}
		
		for (Student s: a) {
			System.out.println("Name: "+s.getName() +"    Roll NO.: "+ s.getRollNo());
		}
		
		System.out.println("****************************");
		
		Collections.sort(a);
		
		
		for (Student s: a) {
			System.out.println("Name: "+s.getName() +"    Roll NO.: "+ s.getRollNo());
		}
		
		
	}

}
