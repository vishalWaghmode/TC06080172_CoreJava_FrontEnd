package Session_14;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup()
				.getParent().getName());//system
		
		ThreadGroup g1=  new ThreadGroup("Firstgroup");
		System.out.println(g1.getParent().getName()); //main
		
		ThreadGroup g2= new ThreadGroup(g1,"Second Group");
		System.out.println(g2.getParent().getName()); //Firstgroup



	}

}
