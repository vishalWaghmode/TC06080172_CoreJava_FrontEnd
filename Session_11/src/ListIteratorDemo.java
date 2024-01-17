//linkedlist used

import java.util.LinkedList;	
import java.util.*;

public class ListIteratorDemo {
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		
		l.add("Mayuri");
		l.add("Sayli");
		l.add("Aish");
		l.add("Nik");
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		
		while(itr.hasNext())
		{
			String str = itr.next();
			
			if(str.equals("Aish"))
			{
				itr.set("Ankita");
			}
			if(str.equals("Nik"))
			{
				itr.add("Kiran");
			}			
		}
		System.out.println(l);		

		while(itr.hasPrevious())
			{
				String str = itr.previous();
				
				if(str.equals("Mayuri"))
				{
					itr.set("Priya");
				}
				if(str.equals("Nik"))
				{
					itr.add("Kia");
				}			
			}
		System.out.println(l);		
	}
}
