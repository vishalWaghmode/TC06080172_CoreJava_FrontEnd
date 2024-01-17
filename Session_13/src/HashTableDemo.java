import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable h =new Hashtable();
		
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");

		System.out.println(h.size());
		
		System.out.println(h);
		//o/p {i=6=C, i=16=F, i=5=A, i=15=D, i=2=B, i=23=E}

		
	}

}
