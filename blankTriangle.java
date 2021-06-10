package data_structure_project;
import java.util.*;

public class blankTriangle {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		
		System.out.println("* ");
		
		for(int i=2;i<=n-1;i++) {
			
			System.out.print("* ");
			for (int j=1;j<=i-2;j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			System.out.println();
		}
		
		if(n>1) {
			for(int i=0;i<n;i++) {
				System.out.print("* ");
			}
		}
		
	}

}
