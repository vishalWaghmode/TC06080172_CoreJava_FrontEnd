package synch;

public class Factorial {
	
	public synchronized void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
			System.out.println("Fact = "+fact);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
