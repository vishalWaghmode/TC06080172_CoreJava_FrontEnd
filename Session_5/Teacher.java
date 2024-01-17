package Session_5;

public class Teacher extends Person {
	
	String sub;
	
	public Teacher() {
	}
	
	public Teacher(int id,String name,String sub) {
		super(id,name);
		this.sub=sub;
		
	}
	
	public void getData() {
		super.getData();
		System.out.println("Sub = "+sub);
	}

}
