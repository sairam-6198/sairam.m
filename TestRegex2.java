package com.techouts.collections;

import java.util.regex.Pattern;

public class TestRegex2 {

	public static void main(String[] args) {
     System.out.println(Pattern.matches("\\d", "1"));
     System.out.println(Pattern.matches("\\d", "11"));
     System.out.println(Pattern.matches("\\d", "1c"));
     System.out.println(Pattern.matches("\\d", "c"));
     System.out.println(Pattern.matches("\\D", "d"));
     System.out.println(Pattern.matches("\\D", "dd"));
     System.out.println(Pattern.matches("\\D", "3"));

  
	}

}
