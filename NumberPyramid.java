package data_structure_project;
import java.util.*;

public class NumberPyramid {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int p=1;
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(p+"   ");
				p+=1;
			}
			System.out.println();
		}
		
	}
	
}
