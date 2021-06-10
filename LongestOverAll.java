package arraysIntroduction;

import java.util.HashSet;
import java.util.Scanner;

public class LongestOverAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdab";
		longest(s);
		
	}

	private static void longest(String s) {
		// TODO Auto-generated method stub
		
		HashSet <Character> set = new HashSet<>();
		String longestTillNow = "";
		String longestOverAll = "";
		
		for(int i=0;i<s.length(); i++) {
			char c = s.charAt(i);
			if(set.contains(c)) {
				longestTillNow = "";
				set.clear();
			}
			set.add(c);
			longestTillNow+=c;
			
			if(longestTillNow.length()>longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
			
		}
		//System.out.println(longestTillNow);
		System.out.println(longestOverAll);
		
	}

}
