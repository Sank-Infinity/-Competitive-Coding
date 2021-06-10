package arraysIntroduction;

import java.util.Map;
import java.util.TreeMap;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {8 ,8 ,2, 4, 5, 5, 1};
		int N = arr.length;
		System.out.println(trappingWater(arr, N));
		
	}

	 static int trappingWater(int arr[], int n) { 
	        
		 int totalDropOfWater = 0;
		 
		 int[] left = new int[n];		 
		 int[] right = new int[n];
		 int leftMax = 0;
		 int rightMax = 0;
		
		 for(int i=0; i<n;i++) {
			 leftMax = Math.max(leftMax, arr[i]);
			 left[i] = leftMax;
		 }
		 
		 for(int i=n-1; i>=0;i--) {
			 rightMax = Math.max(rightMax, arr[i]);
			 right[i] = rightMax;
		 }
		 
		 for(int i=0; i<n;i++) {
			 int mydrops = Math.min(left[i], right[i]);
			 int game = mydrops-arr[i];
			 if(game>0) {
				 totalDropOfWater+=game;
			 }
			 
		 }
		 
		 return totalDropOfWater;
		 
	    } 
	
}
