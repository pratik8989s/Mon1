package sum2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	
	private Map<String, String> obj= new HashMap<String, String>();
	
	
	
	public void setNames( ) {
		obj.put("T001", "pratik");
		obj.put("T002", "bikram");
		obj.put("T003", "gaurav");
	}
	
	
	
	public void printNames( ) {
	
		Set<Entry<String, String>> s=obj.entrySet();
		for (Entry<String, String> i:s) {
			System.out.println(i.getValue());
		}
		
	}
	
	public void printNamesKeySet( ){
		Set<String> s=obj.keySet();
		for (String i:s) 
		{
			System.out.println(i);
		}
	}
	
	
	
	
	
	public void getName( String key ){
		System.out.println("Getting Name via key is: "+obj.get(key));
	}
	
	
	
	
	
	
	public void printSize( ){
		System.out.println("The size of HashMap is: "+obj.size());
	}
	
	
	
	public void remove( String key ){
		
		obj.remove(key);
		System.out.println("key removed is: "+key);
		System.out.println();
	}
	

	
	
	
	
	
	@Override
	public String toString() {
		return "Student [obj=" + obj + "]";
	}

	
	
	
	
	
}
