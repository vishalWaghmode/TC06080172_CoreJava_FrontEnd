import java.util.Comparator;

public class NewMyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
        //return o2.compareTo(o1);
        return -o1.compareTo(o2);

	}

}
