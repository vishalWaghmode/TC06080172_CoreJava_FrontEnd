package synch;

public class MyThread2 {
	
Factorial f;
	
	public MyThread2(Factorial f) {
		super();
		this.f=f;
	}
	
	public void run() 
	{
		f.fact(7);
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}


}
