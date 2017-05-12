package q1;

import java.util.Scanner;

public class FlashCardTest {

	public static void main(String[] args)  {
		FlashCardData fcd=new FlashCardData();
		DisplayThread dt=new DisplayThread();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of data : ");
		int size=sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print("Enter name of subject : ");
			String data1=sc.next();
			
			sc.nextLine();
			//fcd.arr[i].setSubject(data1);
			System.out.print("Enter question : ");
			String data2=sc.nextLine();
			
			System.out.println("============="+data2+"====================================");
			//fcd.arr[i].setQuestion(data2);
			System.out.print("Enter answer : ");
			String data3=sc.nextLine();
	
			System.out.println("------------------"+data3+"-----------------------------------");
			//fcd.arr[i].setAnswer(data3);
			fcd.arr.add(new FlashCard(data1, data2, data3));
			
		}
		dt.setArr(fcd.getArr());
		System.out.println("*************************************************");
		System.out.print("Enter subject to be searched : ");
		String sname=sc.next();
	
			fcd.searchCard(sname);
			fcd.loadData(sname);
			
		// catch (CardNotFoundException e) {
			//e.printStackTrace();
		//}
		
		dt.start();
		
	}
}
