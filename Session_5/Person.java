package Session_5;
import java.util.Scanner;

public class Person {
	int Id;
	 String name;
	 protected Scanner s= new Scanner(System.in);
	 
	 public Person() { 
	 }
	 
	 public Person(int id,String name) {
		 super();
		 this.Id=id;
		 this.name=name;
	 }
	 public void getData() {
		 System.out.println("ID = " + Id + " Name = " +name);
	 }
}
