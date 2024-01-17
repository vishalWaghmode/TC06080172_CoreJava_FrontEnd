import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	
	private int Eid;
	private String name;
	
	public Employee(int Eid, String name) {
		this.Eid=Eid;
		this.name=name;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		
    TreeSet<Employee> t = new TreeSet<>();

	t.add(new Employee(20, "Nikita"));
	t.add(new Employee(53, "Rahul"));
	t.add(new Employee(5, "Ankita"));
	
    System.out.println(t);

	}
}
    