package data_structure_project;
import java.util.Scanner;

public class DownTriangle {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for (int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
