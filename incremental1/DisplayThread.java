package q1;

import java.util.ArrayList;


public class DisplayThread extends Thread {
	
		ArrayList<FlashCard> arr=new ArrayList<FlashCard>();
		
	

		public ArrayList<FlashCard> getArr() {
			return arr;
		}



		public void setArr(ArrayList<FlashCard> arr) {
			this.arr = arr;
		}



		@Override
		public void run() {
			System.out.println("*************************************************");
			for (int i = 0; i < 2; i++) {
				System.out.println(arr.get(i));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		
		}
		
}
