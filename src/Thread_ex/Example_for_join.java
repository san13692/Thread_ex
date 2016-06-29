package Thread_ex;

public class Example_for_join {
	public static void main(String args[]){
		
		System.out.println("Starting main thread");
		
		Thread info = new Readinfo();
		
		info.start();
		
		try {
			info.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(info.isAlive());
		System.out.println("Main finished");
	}

}
