package com.techouts.collections;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("");
		h.add("COOL");
		h.add("KING");
		h.add("BOOM");
		h.add("HITMAN");
		h.add(null);
		System.out.println(h);
		
		HashSet<String> h2=new HashSet<>();
		h2.add("MR.360");
		h2.add("SWING");
		
		h.addAll(h2);
		System.out.println(h);
		
			
	}

}
