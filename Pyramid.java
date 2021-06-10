package arraysIntroduction;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
//		int n = read.nextInt();
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
		
//		for(int i=0; i<n ;i++) {
//			
//			for(int j=0; j<n-i;j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0; j<i; j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//			
//		}	
//		for(int i=0; i<n ;i++) {
//			
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=i; j<n; j++) {
//				System.out.print(" *");
//			}
//			
			
			
			
		}
		
		
	}
	

