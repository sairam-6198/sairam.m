package com.techouts.collections;


import java.util.*;  
class TestArrayList{  
public static void main(String args[]){  
ArrayList<String> l=new ArrayList<String>();
l.add("RAM");
l.add("KOHLI");
l.add("ROHIT");
l.add("AB DE VILLIERS");
l.add("BUMRAH");
l.add(null);
System.out.println(l);

l.add(2,"HITMAN");

Iterator<String> it=l.iterator();
while(it.hasNext()){

	System.out.println(it.next());
}

l.remove(2);
l.remove("RAM");
System.out.println(l);

l.clear();
System.out.println("after clearing");
try{
while(it.hasNext()){
System.out.println(it.next());}}
catch(Exception e){
System.out.println("Exception handled");	
}
 
System.out.println("continues... ");
}}