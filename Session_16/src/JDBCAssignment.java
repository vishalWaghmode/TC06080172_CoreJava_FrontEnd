import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCAssignment {

	public static void main(String[] args) throws
	ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root", "7020");
		System.out.println("Established Connection");
		
		Scanner sc=new Scanner (System.in);
		
		/*PreparedStatement pstmt = con.prepareStatement("Insert into student values(?,?,?)"); //insertion

		System.out.println("Enter roll number= ");
		int roll=sc.nextInt();
		System.out.println("Enter Name = ");
		String name=sc.next();
		System.out.println("Enter student marks = ");
		int marks=sc.nextInt();
		
		pstmt.setInt(1,roll);
		pstmt.setString(2, name);
		pstmt.set(3, marks);*/
		
		
		PreparedStatement pstmt = con.prepareStatement("update student set name=? where roll=?"); //updation

		System.out.println("Enter Name = ");
		String name=sc.next();
		System.out.println("Enter roll = ");
		int roll=sc.nextInt();
		
		pstmt.setInt(1,roll);
		pstmt.setString(2, name);	
		
		/*PreparedStatement pstmt = con.prepareStatement("delete from student where roll=?");  //deletion
		
		System.out.println("Enter roll = ");
		int roll=sc.nextInt();
		
		pstmt.setInt(1,roll);*/

		int i = pstmt.executeUpdate();
		
		System.out.println("Updated table = ");
		PreparedStatement pstmt1 = con.prepareStatement("select*from student");
		ResultSet rs=pstmt1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
}




		