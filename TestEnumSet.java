package com.techouts.collections;

import java.util.*;

enum Months{
	January,
	February,
	March,
	April
}
public class TestEnumSet {

	public static void main(String[] args) {
		
   EnumSet<Months> e=EnumSet.allOf(Months.class);
   System.out.println(e);
   Iterator<Months> it=e.iterator();
   while(it.hasNext()){
	   System.out.println(it.next());
   }
   
	}

}
