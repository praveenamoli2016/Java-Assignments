package Collectionframework;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("praveen");
		al.add(37.8);
		
		al.clear();
		System.out.println(al);
		
		System.out.println(al.add("425"));
		System.out.println(al.contains(500));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		//al.remove(0);
		al.remove("praveen");
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add(50);
		al2.add("sachin");
		al2.add(true);
		al2.add(100);
		
		System.out.println(al2);
		
		al.removeAll(al2);
	
		
		//al.addAll(al2);
		System.out.println(al);
		
		

	}

}
