package test.COM;

import java.util.ArrayList;

public class Test {

	ArrayList<Integer> ar= new ArrayList<Integer>();

	public ArrayList<Integer> getAr() {
		return ar;
	}

	public void setAr(ArrayList<Integer> ar) {
		this.ar = ar;
	}

	@Override
	public String toString() {
		return "Test [ar=" + ar + "]";
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.add();
		Univer u=new Univer(s);
		u.display();
	}

	
}
