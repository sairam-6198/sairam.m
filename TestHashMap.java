package com.techouts.collections;

import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"aaa");
		hm.put(2,"bbb");
		hm.put(5,"eee");
		hm.put(6,"fff");
		hm.put(8,"hhh");
		System.out.println(hm);
		System.out.println("Iterating key & value Using Iterator");
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println("Key " +me.getKey()+" "+"Value " +me.getValue());
		}
		
		System.out.println("Iterating key & value Using for loop");
		for(Map.Entry me:hm.entrySet()){
			System.out.println("Key " +me.getKey()+" "+"Value " +me.getValue());
		}
     hm.remove(5);
     hm.replace(2,"BBB");
     System.out.println(hm);
     System.out.println(hm.containsKey(2));
     System.out.println(hm.containsKey(3));

	}

}
