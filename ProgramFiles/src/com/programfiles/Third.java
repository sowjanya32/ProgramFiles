package com.programfiles;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Third {

	public static void main(String[] args) {
		findPattern("FIRSTDOTLAST");
		findPattern("LASTDOTFIRST");
		findPattern("FIRSTUNDERSCORELAST");
		findPattern("LASTUNDERSCOREFIRST");
		findPattern("FIRSTCHARLAST");
		findPattern("LASTCHARFIRST");
		findPattern("COMMON_EMAIL");
	

	}

	public static void findPattern(String pattern) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(".", "DOT");
		map.put("_", "UNDERSCORE");
		map.put("(1)","CHAR");
		
		Set<Entry<String, String>> setEntry = map.entrySet();
		for(Entry<String, String> entrySet : setEntry) {
			if(pattern.contains(entrySet.getValue())) {
				int length = entrySet.getValue().length();
				int index = pattern.indexOf(entrySet.getValue());
				emailPatternDisplay(pattern, entrySet, length, index);
			}
			else if(pattern.contains(entrySet.getKey())){
				int length = entrySet.getKey().length();
				int index = pattern.indexOf(entrySet.getKey());
				emailPatternDisplay(pattern, entrySet, length, index);
			}
		}
		System.out.println();
	}

	private static void emailPatternDisplay(String pattern, Entry<String, String> entrySet, int length, int index) {
		System.out.print(pattern.substring(0,index).toLowerCase());
		System.out.print(entrySet.getKey());
		System.out.print(pattern.substring(index+length).toLowerCase()+ "@");
	}

}

