package com.techouts.collections;

import java.util.*;


class TeamIndia{
	String name,role;
	int age;
	public TeamIndia(String name,int age,String role){
		this.name=name;
		this.age=age;
		this.role=role;
	}
}
public class TestVector {
	public static void main(String args[]){
	Vector<TeamIndia> l=new Vector<TeamIndia>();
	
	TeamIndia t1=new TeamIndia("Kohli",30,"Batsman");
	TeamIndia t2=new TeamIndia("Hardik",30,"All-rounder");
	TeamIndia t3=new TeamIndia("Bumrah",30,"Bowler");
	
    l.add(t1);
    l.add(t2);
    l.add(t3);
    for(TeamIndia i: l)
    System.out.println(i.name+" "+i.age+" "+i.role);
    System.out.println(l.contains(t2));
    System.out.println();
    l.remove(1);
    for(TeamIndia i: l)
        System.out.println(i.name+" "+i.age+" "+i.role);

	
	}
}
