package sum3;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		TreeSet<String> product = new TreeSet<String>();

		product.add("bikram");
		product.add("anurag");
		product.add("anand");
		product.add("anand");
		// System.out.println(product);
		Iterator<String> it = product.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("************************");
		System.out.println("first name: "+product.first());
		System.out.println("last name: "+product.last());
		System.out.println("************************");
		System.out.println(product.size());
		product.remove("anand");
		System.out.println(product.size());

	}

	@Override
	public String toString() {
		return "TestTreeSet [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
