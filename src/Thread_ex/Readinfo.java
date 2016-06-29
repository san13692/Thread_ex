package Thread_ex;

import java.io.IOException;

public class Readinfo extends Thread {
	public void run(){
		System.out.println("Readin");
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finished reading");
	}

}
