package com.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;








import com.student.Student;
import com.student.StudentInt;

public class StudentImp {

	public static void main(String[] args) {
		int n=1;
		Scanner input= new Scanner(System.in);
		File f= new File("StudentInfo.txt");
		ArrayList<Student> arr=new ArrayList<Student>();
		
		
		/*ArrayList al=new ArrayList();
		
		List l=new ArrayList();*/
		
		
		do {
			
		
		System.out.println("Enter roll no:");
		int rn=input.nextInt();
	//	stu.setRollNo(rn);
		System.out.println("Enter name");
		String nm=input.next();
	//	stu.setName(nm);
		System.out.println("Enter sub1");
		int sub1=input.nextInt();
	//	stu.setSubject1(sub1);
		System.out.println("Enter sub2");
		int sub2=input.nextInt();
	//	stu.setSubject2(sub2);
		System.out.println("Enter sub3");
		int sub3=input.nextInt();
	//	stu.setSubject3(sub3);
		
		Student stu = new Student(rn, nm, sub1, sub2, sub3);
		stu.calcTotal();
		stu.readStudInfo(rn, nm, sub1, sub2, sub3);
		
		stu.printStudInfo();
		arr.add(stu);
		
		
		
		//***********************************************
		
		
		
		
		//	f.createNewFile();
			
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(f);
				ObjectOutputStream oos= new ObjectOutputStream(fos);
				
				oos.writeObject(arr);
				System.out.println("data entered");
				oos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println("if you want to add more type 1 else 0");
		n=input.nextInt();
		} while (n == 1);
		
		
		
		
		
		System.out.println("***********************************************");
		System.out.println("now file handling");
		System.out.println("***********************************************");
		
		
		
		
		
		System.out.println("***********************************************");
		
		
		
		
		
			
			FileInputStream fis;
			try {
				fis = new FileInputStream(f);
				ObjectInputStream ois= new ObjectInputStream(fis);
				
				//Student stu1= (Student)ois.readObject();
				@SuppressWarnings("unchecked")
				ArrayList<Student> arr1=  (ArrayList<Student>) ois.readObject();
				
				for (int i=0;i<arr1.size();i++)
				{
					arr1.get(i).printStudInfo();
				}
				
				ois.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		
		System.out.println("***********************************************");
		

		
		
		
		
		
		

	}

	

	

}
