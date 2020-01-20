package com.techouts.collections;

import java.util.*;

public class TestDeque {
public static void main(String[] args) { 
       Deque<String> dq = new ArrayDeque<String>();
	dq.add("Glenn");
	dq.add("Negan");
	dq.addLast("Maggie");
	dq.addFirst("Rick");
	dq.add("Daryl");
	    
	System.out.println("Elements in Deque:"+dq);
	Iterator it=dq.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}}