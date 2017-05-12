package q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FlashCardData implements CardSearchable {

	ArrayList<FlashCard> arr=new ArrayList<FlashCard>();
	FlashCard fc=new FlashCard();
	
	

	public ArrayList<FlashCard> getArr() {
		return arr;
	}


	public void setArr(ArrayList<FlashCard> arr) {
		this.arr = arr;
	}


	public void loadData(String sub1) {
		
		File f=new File("d:\\cards.txt");
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			
			String s=null ;
			System.out.println("*************************************************");
			while((s=br.readLine())!=null){
			String d[]=s.split(";");
			
			if (d[0].equals(sub1)) {
				System.out.println("Question : "+d[1]+"   Answer : "+d[2]);
			}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	@Override
	public Card searchCard(String sub)    {
		boolean flag= false;
		int a= 0;
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).getSubject().equals(sub)) {
					flag = true;
					a=i;
				}
				
			} 
			
			System.out.println(flag);
			if (flag) {
				System.out.println("Question : "+arr.get(a).getQuestion()+"     Answer : "+arr.get(a).getAnswer());
			} else {
				try {
					throw new CardNotFoundException("The card you are looking for is not available");
				} catch (CardNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			/*for (int i = 0; i < arr.length; i++) {
				if(arr[i].getSubject().equals(sub)){
					System.out.println("Question : "+arr[i].getQuestion()+" Answer : "+arr[i].getAnswer());
			}
				else {
					throw new CardNotFoundException("The card you are looking for is not available");
				}
			}*/
	
		return null;
	}




	
}

	
	
	
	


