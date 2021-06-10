package arraysIntroduction;

import java.util.ArrayList;
import java.util.HashSet;

public class SingleFrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 2, 1, 4};
		int n = arr.length;
		int[] result = maxLen(arr, n);
		for(int item: result) {
			System.out.print(item+" ");
		}
		
		
	}
	
	static int[] maxLen(int arr[], int n)
    {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				set.remove(arr[i]);
			}
			
		}
		
//		System.out.println(set);
		int[] result = new int[2];
		int p=0;
		for(int item:set) {
			result[p] = item;
			p++;
		}
		
		return result;

    }


}
