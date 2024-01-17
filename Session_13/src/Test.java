import java.util.PriorityQueue;

public class Test {
	
	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		System.out.println(q.peek());//null
//		System.out.println(q.remove());//error

		for(int i=1;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);

	}
}
