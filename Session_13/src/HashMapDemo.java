import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		
		h.put("Chitra", 700);
		h.put("Rahul", 800);
		h.put("vicky", 200);
		h.put("nikita", 500);
		System.out.println(h);
		
		System.out.println(h.put("Chitra", 1000));
		System.out.println(h);
		
		Set s= h.keySet();
		System.out.println(s);
		
		Collection c= h.values();
		System.out.println(c);
		
		Set s1= h.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			
			if(m1.getKey().equals("Rahul"))
			{
				m1.setValue(1600);
			}
		}
		System.out.println(h);
	}

}

/*
 o/p
 
 {Chitra=700, Rahul=800, nikita=500, vicky=200}
700
{Chitra=1000, Rahul=800, nikita=500, vicky=200}
[Chitra, Rahul, nikita, vicky]
[1000, 800, 500, 200]
[Chitra=1000, Rahul=800, nikita=500, vicky=200]
Chitra 1000
Rahul 800
nikita 500
vicky 200
{Chitra=1000, Rahul=1600, nikita=500, vicky=200}
*/
