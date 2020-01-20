package com.techouts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Employee2> l=new ArrayList<>();
		l.add(new Employee2(1422,"Ram","ram@techouts"));
		l.add(new Employee2(1426,"Bhavya","bhavya@techouts"));
		l.add(new Employee2(1425,"Charan","charan@techouts"));
		
		Comparator<Employee2> c1=Comparator.comparing(Employee2::getName);
		Collections.sort(l,c1);
		for(Employee2 e:l)
			System.out.println(e.id +" "+e.name+" "+e.mail);
		
		Comparator<Employee2> c2=Comparator.comparing(Employee2::getId);
		Collections.sort(l,c2);
		for(Employee2 e:l)
			System.out.println(e.id +" "+e.name+" "+e.mail);
		

	}

}
