package arraysIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		int[] arr = {13, 9 ,25, 1, 1 ,0, 22, 13, 22, 20, 3 ,8, 11, 25, 10, 3 ,15,11, 19 ,20, 2, 4, 25, 14, 23, 14};
		
		// 10001 is a constraint  N <= 10^4 non-negative numbers
		int[] frequency = new int[10001];
		Arrays.fill(frequency, -1);
		for(int i = 0; i<arr.length;i++) {	
			frequency[arr[i]] += 1;
		}
		
		for(int i=0; i<frequency.length;i++) {
			if(frequency[i]!=-1)
				System.out.print(i+" ");

		}
		
        
	}

}
