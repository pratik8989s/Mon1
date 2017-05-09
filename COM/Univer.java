package test.COM;

public class Univer {
	Student u;
	public Univer(Student s) {
		this.u=s;
	}
	
	@Override
	public String toString() {
		return "Univer [u=" + u + "]";
	}

	public void display(){
		System.out.println(u);
	}
}
