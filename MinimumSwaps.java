package arraysIntroduction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

public class MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {10, 19, 6, 3, 5};
		
		System.out.println(minSwaps(nums));
		
	}

	public static int minSwaps(int nums[])
    {
        // Code here
		int cnt = 0;
		int[] result = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			result[i] = nums[i];
		}
		
		Arrays.sort(result);
		
		int j = result.length-1;
		int i = nums.length-1;
		while(j>=0) {
			if(nums[i]!=result[j]) {
//				System.out.println(nums[i]+" "+result[j]);
				int temp = result[j];
				int k = i;
				while(k>=0) {
					if(temp==nums[k]) {
//						System.out.println(nums[k]);
						int buffer = nums[k];
						nums[k] = nums[i];
						nums[i] = buffer;
						cnt++;
						break;
						
					}
						
					k--;
				}

			}
			i--;
			j--;
		}
		
		
		return cnt;
    }
	
}
