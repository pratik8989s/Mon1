package sync;

public class Test {

		public static void main(String args[]) { 
		Data d = new Data(); 
		new Producer(d); 
		new Consumer(d); 
		}
}