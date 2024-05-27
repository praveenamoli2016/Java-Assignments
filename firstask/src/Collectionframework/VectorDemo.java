package Collectionframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("praveen");
		v.add("naveen");
		v.add("sachin");
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v.removeElement(100));
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		

	}

}
