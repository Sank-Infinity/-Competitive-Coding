package arraysIntroduction;

import java.util.Scanner;

public class StarInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		int test  = read.nextInt(); 
		//String str = read.nextLine();
		//System.out.println(str);
		
		for(int j=0; j<test; j++) {

			int length = read.nextInt();
			int k = read.nextInt();
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			//System.out.println(str);
			String stars = "";
			
			for(int i=0;i<k;i++) {
				stars+='*';
			}
			
			if(str.contains(stars)) 
				System.out.println("Yes");
			else
				System.out.println("NO");
			
		}	
	}
}
