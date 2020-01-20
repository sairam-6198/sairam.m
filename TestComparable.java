package com.techouts.collections;

import java.util.*;

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<NameEmployee> l=new ArrayList<>();
		l.add(new NameEmployee(1422,"Ram","ram@techouts"));
		l.add(new NameEmployee(1426,"Bhavya","bhavya@techouts"));
		l.add(new NameEmployee(1425,"Charan","charan@techouts"));
		Collections.sort(l);
		for(NameEmployee e:l){
			System.out.println(e.id +" "+e.name+" "+e.mail);
		}

	}

}
