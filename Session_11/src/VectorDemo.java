import java.util.*;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Capacity = "+v.capacity());
		
		for(int i=1;i<=11;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		System.out.println("size = "+ v.size());
		
		System.out.println("Capacity = "+v.capacity());

	}

}
