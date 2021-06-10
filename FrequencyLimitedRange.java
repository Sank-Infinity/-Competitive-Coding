package arraysIntroduction;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyLimitedRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {2, 3, 2, 3, 5};
		int N = arr.length;
		int P = 5;
		frequencyCount(arr, N, P);
		
	}

	static void frequencyCount(int arr[], int N, int P)
    {
		
		
		int a[] = new int[arr.length];
		Arrays.fill(a, 0);
		
		for(int i=0; i<arr.length;i++) {
			a[arr[i]-1]+=1;
		}
		
		for(int l=0; l<arr.length; l++) {
			arr[l] = a[l];
			System.out.println(arr[l]);
		}
		
    }
	
}
