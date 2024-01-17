package Session_5;

public class D extends C{
	
	public D() {
		super();
		System.out.println("Child Default");
		
	}
	
	public D(int a) {
		super(10);
		System.out.println("Child Parameterized");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
 		D d1=new D(10);
		

	}

}
