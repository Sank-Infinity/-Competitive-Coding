package data_structure_project;

import java.util.Arrays;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {6,6,6,7,7};
		System.out.println(majorityElement(nums));
	}

	static int majorityElement(int[] nums) {
		
		int maxNum = 0;
		int maxQun = 0;
		int cnt = 0;
		
		if(nums.length==1) {
			return nums[0];
		}
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i++) {
//			System.out.println(nums[i]);
			if(nums[i]==nums[i+1]) {
				cnt+=1;
			}else {
				cnt=0;
			}
			if(cnt>maxNum) {
				maxNum = cnt;
				maxQun = nums[i];
			}
		}
//		System.out.println(cnt);
		
        return maxQun;
    }
}
