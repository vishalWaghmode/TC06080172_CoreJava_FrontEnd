/*import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		//t.add(null); //NullPointerException
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("M");
		
		System.out.println(t); //ascending (default) sorted order
		//descending - customized order
		
		t.add(10);
		System.out.println(t);//ClassCastException - heterogeneous obj not allowed
		
//		t.add(null);
//		System.out.println(t); //NullPointerException
 * 	
  }
}*/

/*import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		//t.add(new StringBuffer("a"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		
		System.out.println(t);
	
	}
}*/
