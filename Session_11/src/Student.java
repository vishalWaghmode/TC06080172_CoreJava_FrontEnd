import java.io.Serializable;

public class Student implements Serializable{

	private int roll;
	private String name;
	private transient float fees;
	
	public Student() {}
	
	public Student(int roll, String name, float fees ) {
		
		super();
		this.roll=roll;
		this.name=name;
		this.fees=fees;
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", fees=" + fees + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s = new Student(1,"Aish",1200.8f);
		Student s1 = (Student) s.clone();
		System.out.println(s1);
	}
	
}
