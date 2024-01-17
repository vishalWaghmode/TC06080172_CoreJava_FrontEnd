
public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException{

		ThreadGroup pg = new ThreadGroup("parent group");
		ThreadGroup cg = new ThreadGroup(pg,"child group");
		
		MyThread t1= new MyThread(pg, "first");
		MyThread t2= new MyThread(pg, "second");
		
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

	}

}
