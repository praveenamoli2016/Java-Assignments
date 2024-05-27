package Collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap tp=new TreeMap<>();
		
		tp.put(101, "praveen");
		tp.put(102, "sachin");
		tp.put(108, "naveen");
		tp.put(105, "rahul");
		
//		tp.put("praveen",101);
//		tp.put("sachin",102);
//		tp.put("naveen",108);
//		tp.put("rahul",105);
		
		System.out.println(tp.get(101));
		System.out.println(tp);

	}

}
