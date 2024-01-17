import java.util.TreeSet;

public class HomeWork {
	
public static void main(String[] args) {
	
		//TreeSet<String> t = new TreeSet<String>(); //asc order

        TreeSet<String> t = new TreeSet<>(new NewMyComparator());

        t.add("Nikita");
        t.add("Nik");
        t.add("Rahul");
        t.add("Ankita");
        System.out.println(t); 

	}

}
