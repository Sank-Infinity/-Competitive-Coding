package data_structure_project;

import java.util.ArrayList;
import java.util.Arrays;

public class CountMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 2, 2 ,3 ,3};
		int n = arr.length;
		int k = 3;
		System.out.println(countOccurence(arr,  n,  k));
	}

	static int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
		
		int cnt = 0;
		int maxQun = 0;
		
		if(n==1) {
			if(1 >= n/k) {
				return arr[0];
			}
		}
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		Arrays.sort(arr);
		
		for(int i=0; i<n-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				cnt+=1;
			}else {
				cnt=0;
			}
			
			if(cnt >= n/k) {
				maxQun = arr[i];
				aList.add(arr[i]);
			}
//			System.out.println(cnt+" "+ n/k);
			
		}
//		System.out.println("------------> "+ aList.get(0));
		maxQun = aList.get(0);
		return maxQun;
    }
	
}
