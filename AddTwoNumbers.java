package data_structure_project;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		
		int[] nums = {2,5,5,11};
		int target = 10;
		int[] output = twoSum( nums, target);
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] a = new int[2];
		boolean isTrue = false;
		for(int i = 0; i<nums.length-1;i++) {
			for(int j=1; j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					a[0] = i;
					System.out.print(i);
					a[1] = j;
					System.out.print(j);
					isTrue = true;
					System.out.println();
				}
			}
				System.out.println();
		}
		
		
		System.out.println(isTrue);
		return a;
    }
}
