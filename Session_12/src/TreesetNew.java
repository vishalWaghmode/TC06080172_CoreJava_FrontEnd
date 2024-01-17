import java.util.TreeSet;

public class TreesetNew {
	
	public static void main(String[] args) {
		
		//TreeSet<Integer> t = new TreeSet<Integer>(); //default order-ascending
		
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator()); //customized order-desc

        t.add(10);
        System.out.println(t); // [-ve → [10]]

        t.add(0);
        System.out.println(t); // [0,10]

        t.add(15);
        System.out.println(t); // [0,10,15]

        t.add(10);
        System.out.println(t); // [0,10,15]

	}

}
