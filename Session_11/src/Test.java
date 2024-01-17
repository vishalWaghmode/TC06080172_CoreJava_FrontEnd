import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		FileOutputStream fos = new FileOutputStream("d://abc.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Student s = new Student(1,"rahul",1000.45f);
//		
//		oos.writeObject(s);
//		System.out.println("Success");
//		oos.close();
//		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://abc.txt"));
		Student s = (Student)ois.readObject();
		System.out.println(s);
	}

}
