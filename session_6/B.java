package session_6;

public class B extends A {				
	B get() {
		return this;
	}
	
	void msg() {
		System.out.println("Hello World");
	}
	
	public static void main(String args[]) {
		new B().get().msg();			//covariant return type
		
	}
}
