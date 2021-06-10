package data_structure_project;
import java.util.Scanner;

public class duplicateNum {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter number of elements :");
		int k = read.nextInt();
		
		System.out.print("Enter elements of array: ");
		int a[] = new int[k];
		for(int i=0;i<k;i++) {
			a[i] = read.nextInt();
		}
		int length = a.length;
		System.out.print(findDuplicate(a,length));
	}
	
	static int findDuplicate(int a[], int length) {
		int result=0;
		
		for(int i=0;i<length; i++) {
			for(int j=i+1;j<length;j++) {
				if(a[i]==a[j]) {
					result = a[i];
					break;
				}
			}
		}
		
		return result;
	}
	
}
