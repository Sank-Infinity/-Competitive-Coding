package data_structure_project;
import java.util.*;

public class boxPattern {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
	
}
