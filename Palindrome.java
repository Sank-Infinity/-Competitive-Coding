package arraysIntroduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		String[] game = String.valueOf(read.nextLine()).split("");
		
		int end = game.length-1;
		
		for(int i=0;i<game.length;i++) {
			
			if(game.length%2!=0 && game.length/2==i  ) {
//				System.out.println(i);
				end--;
//				continue;
				
			}else {
				
				if(!game[i].equals(game[end])) {
//					System.out.println(game[i]+" "+game[end]);
					System.out.println("NOt Palindrome");
					return;
				}
				end--;
				
			}
			
			
		}
		System.out.println("Palindrome");
	
	}

}
