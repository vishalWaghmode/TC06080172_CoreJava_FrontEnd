package synchDeposite;
;

public class Test {

	public static void main(String[] args) {

		Account a= new Account(4000);
		
		MyThread1 t1= new MyThread1(5000); 
		MyThread2 t2= new MyThread2(3000); 
		
		t1.start();
		t2.start();

	}

}
