package Thread_ex;

public class Using_runnable {
	public static void main(String[] args){
		Runnable rn = new Secondthread();
		
		Thread th = new Thread(rn , "sur");
		Thread th1 = new Thread(rn , "su324r");
		Thread th2 = new Thread(rn , "sur23");
		
		
		th.start();
		th1.start();
		th2.start();
		
		
	}

}
