import java.util.LinkedList;	
import java.util.*;
import java.io.Serializable;

public class LinkedListDemo {
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		
		l.add("Mayuri");
		l.add(40);
		l.add(null);
		l.add(40);
		
		System.out.println(l);
		
		l.set(0,"rahul");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(40);
		System.out.println(l);
		
		l.add(2,100);
        System.out.println(l);
        
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);

        
		
		
		
		
	}

}
