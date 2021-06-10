package data_structure_project;
import java.util.*;

public class rotate {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int k = read.nextInt();
		
		System.out.println("Enter elements in array: ");
		int[] a = new int[k];
		int[] b = new int[k];
		
		for(int i=0;i<k;i++) {
			a[i] = read.nextInt();
		}
		
		
		for(int i=1;i<k;i++) {
			if(i==k-1) {
				b[0]=a[k-1];
				b[i]=a[i-1];
				break;
			}
			else {
				b[i]=a[i-1];
			}
		}
		
		
		for(int i=0;i<k;i++) {
			System.out.print(b[i]+" ");
		}
		
	}
	
}
