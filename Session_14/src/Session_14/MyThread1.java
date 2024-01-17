package Session_14;

public class MyThread1 implements Runnable{

	@Override
	public void run() {

		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		MyThread1 m1=new MyThread1();
		Thread t1= new Thread(m1);
		MyThread1 m2=new MyThread1();
		Thread t2= new Thread(m2);
		MyThread1 m3=new MyThread1();
		Thread t3= new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
