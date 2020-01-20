package com.techouts.collections;

import java.util.*;
enum Rank{
	One(1),
	Two(2),
	Three(3)
;
	private final int value;
	public int getValue(){
		return value;
	}
	private Rank(int value){
		this.value=value;
		}
	
	}
public class TestEnumMap2 {

	public static void main(String[] args) {
		Rank[] fr=Rank.values();
		for(Rank r:fr){
			System.out.println(r.name()+"   "+r.getValue());
		}
		
		System.out.println("EnumMap");
		EnumMap<Rank,TeamIndia> e1=new EnumMap<>(Rank.class);
		TeamIndia t1=new TeamIndia("Kohli",30,"Batsman");
		TeamIndia t2=new TeamIndia("Hardik",30,"All-rounder");
		TeamIndia t3=new TeamIndia("Bumrah",30,"Bowler");
		e1.put(Rank.One, t1);
		e1.put(Rank.Two, t3);
		e1.put(Rank.Three, t2);
		for(Map.Entry<Rank,TeamIndia> me :e1.entrySet()){
			TeamIndia ti=me.getValue();
			Rank r=me.getKey();
			System.out.println("Rank " +r.getValue()+" "+ti.name+" "+t1.age+" "+ti.role);
		}
			
	}

}
