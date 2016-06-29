package Thread_ex;

public class Use_printstring implements Runnable {
	
	
	private
	String str1;
	String str2;
	
     public Use_printstring(String str1, String str2) {
		// TODO Auto-generated constructor stub
		
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		Thread thread = new Thread(this);
		thread.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Print_string.print(str1, str2);
	}

}
