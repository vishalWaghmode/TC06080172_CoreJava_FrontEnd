import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws
	ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root", "7020");
		System.out.println("Established Connection");
		
		PreparedStatement pstmt = con.prepareStatement("Insert into employee values(?,?,?)");
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Employee ID = ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name = ");
		String name=sc.next();
		System.out.println("Enter Employee Salary = ");
		float sal=sc.nextFloat();
		
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, sal);
		
		int i = pstmt.executeUpdate();
		
		if(i>0)
			System.out.println("Employee Record successfully inserted!!");
		else
			System.out.println("Failed!!");
		
		PreparedStatement pstmt1 = con.prepareStatement("select*from Employee");
		ResultSet rs=pstmt1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
	}
}
