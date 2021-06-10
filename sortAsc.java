package data_structure_project;
import java.util.*;

public class sortAsc {

	public static void main(String[] args) {
		
		int n , temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		
		System.out.println("Enter elements: ");
		int a[] = new int[20];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n;j++) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;				
				}
			}
		}
		
		System.out.println("Sorted array :");
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
}
