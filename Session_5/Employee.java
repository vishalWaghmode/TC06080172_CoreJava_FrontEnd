package Session_5;

public class Employee {
	
	private int empId;
	private String empName;
	
	public Employee() {}
	
	public Employee(int empId,String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId = " + empId +",empName = "+ empName + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if((this.empId == e.empId) && (this.empName.equals(e.empName)))
			return true;
		else
			return false;
	}
	
	
	 public static void main(String[] args) {
		 Employee e1= new Employee(111,"qvf");
		 Employee e2= new Employee(111,"vfq");
		 
/*		 if (e1 == e2) {
			 System.out.println("Equal");
		 }										as the objects are different which will have different references
		 										it will print not equal
	     else {
	    	 System.out.println("Not equal");
		 }
*/
		 
		 if(e1.equals(e2)) {
			 System.out.println("objects are eqaul");		//correct way
		 }
		 else {
			 System.out.println("object are not equal");
		 }
		 

		 System.out.println("e1 = "+ e1.hashCode());
		 System.out.println("e1 = "+ e2.hashCode());
	 }
}
