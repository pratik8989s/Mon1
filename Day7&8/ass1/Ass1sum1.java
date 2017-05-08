package ass1;

import java.util.ArrayList;
import java.util.Iterator;



public class Ass1sum1 {

	
		
	private ArrayList<String> names= new ArrayList<String>();
	
		public void setNames(String a) {
			names.add(a);
	}
		
		
		public void searchName(String name) {
		
			for (int i = 0; i < names.size(); i++) 
			{
				if(names.get(i).equals(name))
				{
					System.out.println("Name is found at index: "+i+" is: "+names.get(i));
					break;
				
				}
				
			
		}
			
		}
		
		
		public void searchName(int index)
		{
			System.out.println("The name at that index: "+index+" is "+names.get(index));
		}
		
		Iterator<String> it = names.iterator();
		
		public void printNames( ){
			Iterator<String> it = names.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
		}
		
		
		public void removeName( String stuName ) {
			
			for (int i = 0; i < names.size(); i++) {
			
				if(names.get(i).equals(stuName))
				{
					System.out.println("name exists it'll be removed");
					names.remove(i);
					break;
				}
				
			}
			
			
		}


		@Override
		public String toString() {
			return "Ass1sum1 [names=" + names + "]";
		}


		
		
		
		
		
		
}

