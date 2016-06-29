package Thread_ex;

public class using_threadclass {
	public static void main(String[] args){
		Thread t1 = new My_thread("Anand");
		Thread t2 = new My_thread("Anand1");
		Thread t3 = new My_thread("Anand21");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
