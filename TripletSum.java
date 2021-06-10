package data_structure_project;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 4, 45, 6, 10, 8};
		int n = arr.length;
		int sum = 13;
		System.out.println(find3Numbers(arr, n, sum));
		
	}

	static boolean find3Numbers(int A[], int n, int X) { 
		    
		Arrays.sort(A);
		
		for(int i=0; i<A.length; i++) {
			int temp = X - A[i];
			if(twoSum(A, temp, i+1)) {
				return true;
			}
		}
	       
	    return false;
	}
	
	static boolean twoSum(int[] a , int sum, int i) {
		
		int j = a.length-1;
		while(i<j) {
			if(a[i] + a[j] > sum)
				j-=1;
			else if(a[i] + a[j] < sum)
				i+=1;
			else
				return true;
		}
		
		return false;
	}
	
}
