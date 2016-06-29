package Thread_ex;

public class Secondthread implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for(int i = 0;i<10;i++){
				System.out.println(i + "Current Thread" + Thread.currentThread().getName());
				
			
		}
		
		
		
	}
	
	
	

}
