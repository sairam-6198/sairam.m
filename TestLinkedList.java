package com.techouts.collections;

import java.util.*;

public class TestLinkedList {
	public static void main(String args[]){
		LinkedList<Integer> l=new LinkedList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(100);
		System.out.println(l);
		Iterator<Integer> i=l.iterator();
		l.remove();
		try{
		while(i.hasNext()){
		System.out.println(i.next());
	}}catch(Exception e){}
		System.out.println("con");}

}
