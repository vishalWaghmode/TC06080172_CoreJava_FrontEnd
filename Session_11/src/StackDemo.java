import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push("A");  //str
		s.push('B'); //char
		
		System.out.println(s);
		System.out.println(s.empty());   //false
		System.out.println(s.peek());   //B
		System.out.println(s.search('A'));  //-1  searching for char but in stack str is there
		System.out.println(s.search(10)); //4  gives position for int (bottom-up approach)
		
		System.out.println(s.search('B'));  //1  -> gives 1 if char/str is present else gives -1

		s.pop();
		System.out.println(s);


	}

}
