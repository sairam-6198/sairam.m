package com.techouts.collections;

import java.util.*;
public class TestEnumMap {

	public static void main(String[] args) {
		EnumMap<Months,Integer> e=new EnumMap<>(Months.class);
		e.put(Months.January, 1);
		e.put(Months.March, 3);
		e.put(Months.April, 4);
		for(Map.Entry me:e.entrySet()){
			System.out.println(me.getKey()+" "+me.getValue());
		}
		System.out.println(e.get(Months.April));
		System.out.println(e.hashCode());
		

	}

}
