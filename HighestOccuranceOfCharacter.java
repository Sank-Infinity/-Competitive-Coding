package arraysIntroduction;

import java.util.Scanner;

public class HighestOccuranceOfCharacter {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String s = read.nextLine();
		int cnt = 0;
		int max = 0;
		
		for(int i=0;i<s.length()-1;i++) {
			cnt = 0;
			for(int j = 1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt++;
				}
			}
			if(cnt>max) {
				max = cnt;
			}
		}
		
		System.out.println(max);
		
	}
	
}
