package multithreading;

import java.util.ArrayList;

public class Item {

	int Itemno;
	String ItemName;
	
	
	
	@Override
	public String toString() {
		return "Item [at=" + at + "]";
	}

	ArrayList<Item> at= new ArrayList<Item>();
 	
	public void displayItems() {
		for (int i = 0; i < at.size(); i++) {
			System.out.println(at.get(i).Itemno+"             "+at.get(i).ItemName);
		}

	}

	public Item(int itemno, String itemName) {
		super();
		Itemno = itemno;
		ItemName = itemName;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
