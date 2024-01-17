package Session_5;

public final class A {
	final int a;
	public A() {
		a=100;
	}
	
	public final void get() {				//cannot be overridden
		System.out.println("In get() of A");
	}
}
