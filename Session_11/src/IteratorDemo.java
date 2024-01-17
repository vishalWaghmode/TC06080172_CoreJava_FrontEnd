import java.util.*;
//used arraylist
public class IteratorDemo {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
	//	l.add("ABC");
	//	l.add(null);
		l.add(10);
		l.add(56);
		l.add(89);
		l.add(31);
		System.out.println(l);
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(n%2==0) {
				System.out.println(n);
			}
			else 
			{
				i.remove();
			}
		}
		System.out.println(l);
//		l.add(2,31);
//		System.out.println(l);
//		
//		l.remove(3);
//		System.out.println(l);
//
//		System.out.println(l.contains(100));
//		
//		List l1 = Collections.synchronizedList(l);
//		//System.out.println(l1);

		
}

}
