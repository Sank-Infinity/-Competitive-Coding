package arraysIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorityElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,2,0,2,2};
		System.out.println(majorityElement(nums));
		
	}
	
static List<Integer> majorityElement(int[] nums) {
		
		int maxQun = -9999999;
		int cnt = 1;
		List<Integer> aList = new ArrayList<>();
		
		if(nums.length==1) {
			aList.add(nums[0]);
			return aList;
		}
		if(nums.length==2) {
			if(nums[0] != nums[1]) {
				aList.add(nums[0]);
				aList.add(nums[1]);
			}else {
				aList.add(nums[0]);
			}
			
			return aList;
		}
		Arrays.sort(nums);
		
		
		for(int i=0;i<nums.length-1;i++) {
//			System.out.println(nums[i]);
			if(nums[i]==nums[i+1]) {
				cnt+=1;
			}else {
				cnt=1;
			}
			if(cnt > (nums.length/3) ) {
//				System.out.println(nums[i]);
				maxQun = nums[i];
//				System.out.println(maxQun);
				if(!aList.contains(nums[i]))
					aList.add(maxQun);
			}
		}
//		System.out.println(cnt);
		
        return aList;
    }

	

}
