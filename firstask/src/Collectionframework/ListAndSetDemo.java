package Collectionframework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class ListAndSetDemo {

	public static void main(String[] args) {
		
		List l=new ArrayList<>();
		l.add(0, 10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(20);
		l.add(null);
		l.add(null);
		
		//System.out.println(l);
	
	//Iterator itr =l.iterator();
	
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
//		ListIterator itr =l.listIterator();	
//	while(itr.hasPrevious()) {
//		System.out.println(itr.previous());
//	}
		
		Vector v=new Vector<>();
		v.add(100);
		v.add("deepak");
		v.add(15.2);
		
		Enumeration enumeration=v.elements();
	
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		Set s=new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(10);
		s.add(null);
		l.add(null);
		
		//System.out.println(s);
		
		Iterator itr2 =s.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
