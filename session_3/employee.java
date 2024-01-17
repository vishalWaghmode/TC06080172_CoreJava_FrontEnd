package session_3;

public class employee {
	private int empId;
	private String empName;
	private Date doj;
	
	public employee() {}	//generate default,parameterized constructor and tostring()
	public employee(int empId,String empName,Date doj) {
		this.empId=empId;
		this.empName=empName;
		this.doj=doj;
	}
	
	public String toString() {
		return "employee [empId=" +empId + ",empName= " +empName +", "+ "doj = "+doj+ "}";
		}
	public static void main(String args[]) {
		employee e = new employee(111,"ammu",new Date(19,10,2023));
		System.out.println(e);
	}
	

}


//Containment:
//	one object part of another object 

