package Collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCollection {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("praveen");
		h.add(10);
		h.add("c");
		h.add("xyz");
		h.add(true);
		h.add("aarohi");
		h.add("aarohi");
		h.add(null);
		h.add(null);
		//System.out.println(h);
		Iterator itr=h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		List l=new ArrayList(h);
		l.add("praveen");
		l.add(10);
		l.add("c");
		System.out.println(l);
		
	}
}
