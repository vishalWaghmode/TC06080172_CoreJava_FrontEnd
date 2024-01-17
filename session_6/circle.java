package session_6;

public class circle extends shape {
	private int radius;
	
	public circle(int radius) {
		this.radius=radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	
	

}
