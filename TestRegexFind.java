package com.techouts.collections;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexFind {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Pattern p=Pattern.compile(sc.nextLine());
		Matcher m=p.matcher(sc.nextLine());
		while(m.find()){
			System.out.println("The text "+m.group()
			+" found at index " +m.start());
		}
	}
}
