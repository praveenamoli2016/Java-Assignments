package Collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push("praveen");
		s.push("sachin");
		s.push("naveen");
		s.push(100);
		s.push(20.8);
		s.push(null);
		s.push(null);
		
		System.out.println(s);
		//System.out.println(s.pop());
		//System.out.println(s);
//		System.out.println(s.peek());
//		System.out.println(s);
		//System.out.println(s.search("praveen"));
		System.out.println(s.isEmpty());
		//System.out.println(s);


	}

}
