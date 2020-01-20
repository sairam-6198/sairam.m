package com.techouts.collections;

import java.util.*;  
public class ArrayDeque1 {  
   public static void main(String[] args) {  
   
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");    
  System.out.println(deque);
   for (String str : deque) {  
   System.out.println(str);  
   }  
  
   Iterator i=deque.descendingIterator();
   while(i.hasNext()){
   System.out.println(i.next());
   }  }
}  