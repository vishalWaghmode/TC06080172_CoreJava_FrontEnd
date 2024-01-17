package Session_14;

public class MyThread2 extends Thread {

	public void run() 
	{
     System.out.println(Thread.currentThread().getName()+" "+
	Thread.currentThread().getPriority());
			
	}
	
	public static void main(String[] args) {
		
		MyThread2 t1=new MyThread2(); //born state  
		MyThread2 t2=new MyThread2();
		MyThread2 t3=new MyThread2();
		
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		//1-10
		t1.setPriority(MAX_PRIORITY);  //10
		t2.setPriority(MIN_PRIORITY);	//1
		t3.setPriority(NORM_PRIORITY);	//5
		
		t1.start();
		t2.start();
		t3.start();
	}
}
