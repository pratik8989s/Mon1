package sum4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriteEmployee {

	public static void main(String[] args) {
		
		int eno;
		String ename;
		int ebasic;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the emp no");
		eno=input.nextInt();
		System.out.println("Enter the emp name");
		ename=input.next();
		System.out.println("Enter the emp basic");
		ebasic=input.nextInt();
		
		Employee emp=new Employee(eno, ename, ebasic);
		
		System.out.println(emp);
		
		
		File f = new File("emp.txt");
		
		try {
			f.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			System.out.println("data entered");
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp1 = (Employee)ois.readObject();
			System.out.println(emp1);
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
		
		
		
		
		
		
		
	}

}
