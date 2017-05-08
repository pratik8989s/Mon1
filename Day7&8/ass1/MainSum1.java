package ass1;
import java.util.Scanner;

public class MainSum1 {

	public static void main(String[] args) {

		
		Scanner input= new Scanner(System.in);
		
		Ass1sum1 obj =new Ass1sum1();
		System.out.println("Enter The name: ");
		String ab1=input.next();
		String ab2=input.next();
		String ab3=input.next();
		String ab4=input.next();
		String ab5=input.next();
		obj.setNames(ab1);	
		obj.setNames(ab2);
		obj.setNames(ab3);
		obj.setNames(ab4);
		obj.setNames(ab5);
		
		System.out.println("**********************************");
		System.out.println("the array list is");
		System.out.println(obj);
		
		
		
		System.out.println("**********************************");
		System.out.println("Now searching name via String");
		System.out.println("Input the name to be searched");
		String ser=input.next();
		obj.searchName(ser);
		
		
		int b;
		System.out.println("**********************************");
		System.out.println("Now searching name via integer index");
		System.out.println("Enter the index at which you want to find the name");
		b=input.nextInt();
		obj.searchName(b);
		
		
		System.out.println("now enter the string name to be removed");
		String xcv=input.next();
		obj.removeName(xcv);
			System.out.println(obj);
				
			}

		


	}


