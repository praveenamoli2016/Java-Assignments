package Collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		//LinkedList ll=new LinkedList<>();
		LinkedList ll=new LinkedList<>(al);
		ll.add(10);
		ll.add("praveen");
		ll.add(20.6);
		ll.add(null);
		ll.add(null);
		ll.add(null);
		

		System.out.println(ll);
		
		//ll.addFirst("naveen");
		ll.removeFirst();
		System.out.println(ll.getLast());
		System.out.println(ll);
	}

}
