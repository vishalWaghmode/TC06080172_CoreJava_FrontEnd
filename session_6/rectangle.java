package session_6;

public class rectangle extends shape {

	private int l,b;
	
	public rectangle(int l, int b) {
		this.l=l;
		this.b=b;
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (l*b);
	}
}
