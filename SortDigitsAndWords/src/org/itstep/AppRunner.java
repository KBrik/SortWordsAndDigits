package org.itstep;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppRunner {

	public void main(String[] string) {
	
	}

	public String convertString(String testString) {
		String firstString = "abcd2e";
		StringBuffer buffer = new StringBuffer(firstString);
		char[] word = String.valueOf(firstString).toCharArray();
		ArrayList <Character> tempArrayforDigits = new ArrayList<Character>();
		
		for (int i = 0; i < word.length; i++) {
			if(Character.isDigit(i)) {
				tempArrayforDigits.add(i,word[i]);
			 	buffer.deleteCharAt(i);
			}
			
		}
		
	       buffer.reverse();
	       
		   buffer.toString();
	       System.out.println(buffer);
	    
	 
	       
		
		
		return firstString;
	}

}
