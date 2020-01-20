package com.techouts.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
    Pattern p=Pattern.compile(".as");
    Matcher m=p.matcher("bas");
    boolean b=m.matches();
    System.out.println(b);
    System.out.println(Pattern.matches("..as","hgas"));
    System.out.println(Pattern.matches("[as]", "a"));
    System.out.println(Pattern.matches("[as]", "as"));
    System.out.println(Pattern.matches("[as]", "aaa"));
    System.out.println(Pattern.matches("[as]", "s"));
    System.out.println(Pattern.matches("[^as]", "a"));
    System.out.println(Pattern.matches("[^as]", "d"));
    System.out.println(Pattern.matches("[ASa-z]{6}", "Alekya"));


	}

}
