package data_structure_project;
import java.util.*;

public class horizontalTriangle {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
			
		for(int i=1;i<=n;i++) {
			for (int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for (int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
