package Session_4;

public class B extends A {
	
	public void m1() {
		System.out.println("in m1() of B");
	}
	
	public void m2() {
		System.out.println("in m2() of b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b=new B();
	//  System.out.println(b.no);
		b.getNo();
		b.m1();
		((B) b).m2();
		
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
	}

}
