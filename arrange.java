package data_structure_project;
import java.util.*;

public class arrange {
	
	static void paint(int a[], int length) {
		
		int j=0, temp;
		
		for(int i=0; i<length;i++) {
			
			if(a[i]<0) {
				if(i!=j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
			
		}
		
		print(a, length);
		
	}
	
	static void print(int a[], int length) {
		
		for(int i=0;i<length;i++) {
			System.out.print(a[i]+ " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.print("Enter number of elements in List : ");
		int n = read.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++) {
			a[i] = read.nextInt();
		}
		
		int length = a.length;
		
		paint(a, length);
		
	}
	
}
