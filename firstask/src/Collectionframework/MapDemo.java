package Collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo  {
		public static void main(String[] args) {
			//HashMap hm=new HashMap();
			HashMap<Integer,String> hm=new HashMap<Integer, String>();
			hm.put(101,"praveen");
			hm.put(102,"rahul");
			hm.put(103,"rishab");
			hm.put(104,"rahul");
			//hm.clear();
			System.out.println(hm.containsKey(107));
			//System.out.println(hm.get(101));
			//hm.remove(101);
			//System.out.println(hm);
			for(Map.Entry me: hm.entrySet()) {
				
				System.out.println(me.getKey()+"->"+me.getValue());
			
//			Set set=hm.entrySet();
//			Iterator itr=set.iterator();
//			while(itr.hasNext()) {
//				//System.out.println(itr.next());
//				Map.Entry entry=(Entry) itr.next();
//				
//				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
			
		}
	}

