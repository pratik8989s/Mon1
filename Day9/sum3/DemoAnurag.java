package sum3;

import java.io.File;
import java.util.Scanner;

public class DemoAnurag {

	public static void main(String[] args) {
		
		System.out.println("Enter Directory Name: ");
		Scanner scan = new Scanner(System.in);
		File f = new File(scan.next());
		
		if (f.exists()) {
			String l[]=f.list();
			for (String string : l) {
				System.out.println(string);
			}
		} else {
			System.out.println("Directory does not exists");
		}

	}

}
