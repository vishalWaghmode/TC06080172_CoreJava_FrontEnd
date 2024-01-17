package synch;

public class MyThread1 extends Thread {

	Factorial f;
	
	public MyThread1(Factorial f) {
		super();
		this.f=f;
	}
	
	public void run() 
	{
		f.fact(5);
	}
}
