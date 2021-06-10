package arraysIntroduction;

import java.util.ArrayList;
import java.util.Scanner;

public class LastFibbonaciElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner read = new Scanner(System.in);
			
			int n = read.nextInt();
			
			if(n==0) 
				System.out.println(0);
			
			else if(n==1) 
				System.out.println(1);
			
			else {
				int fibo = fiboFunction(n);
				System.out.println(fibo);
				
			}
		}	
	
	
	
	public static int fiboFunction(int n) {
		
		int fibo = 0;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			return (fiboFunction(n-2)+fiboFunction(n-1));
		}
	}

}
