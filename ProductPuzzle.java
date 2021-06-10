package arraysIntroduction;

import java.util.Arrays;

public class ProductPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[] = {13,3
};
		int n = nums.length;
		long[] result = productExceptSelf(nums, n);
		
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
		long[] result = new long[nums.length];
		long[] left = new long[nums.length];
		long[] right = new long[nums.length];
		left[0] = 1;
		right[right.length-1] = 1;
		long total = 1;
		
		for(int i=0;i<left.length-1;i++) {
			total *= nums[i];
			left[i+1] = total;
		}
		
		
		long totalProduct = 1;
		int p = nums.length-1;
		for(int i=right.length-2;i>=0;i--) {
			totalProduct *= nums[p];
			right[i] = totalProduct;
			p--;
		}
		
		for(int i=0; i<nums.length;i++) {
			result[i] = (left[i] * right[i]);

		}
		
				
		return result;
		
		
	} 
	
}
