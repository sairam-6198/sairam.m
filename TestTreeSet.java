package com.techouts.collections;

import java.util.*;  
class TestTreeSet{  
 public static void main(String args[]){  
  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
    
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());}  
   
   al.pollFirst();
   al.pollLast();
   Iterator<String> itr1=al.iterator();  
   while(itr1.hasNext()){  
   System.out.println(itr1.next());}
   System.out.println(al.size());
  }  
 }  
  
