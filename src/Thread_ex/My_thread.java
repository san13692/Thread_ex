package Thread_ex;


	
	public class My_thread extends Thread{
		
		public void run(){
			for(int i = 0;i<10;i++){
				System.out.println("Current Thread" + Thread.currentThread().getName());
				System.out.println(i);
			}
		}
		public My_thread(String name){
			super(name);
		}
		
	

}
