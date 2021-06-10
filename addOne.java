package arraysIntroduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,9,9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		
		System.out.println(plusOne(list));
	}

	static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

		ArrayList<Integer> list = new ArrayList<>();
		
		Collections.reverse(A);
		
		int carry = 1;
		for(int i=0; i<A.size();i++) {
			
			if(carry == 0) {
				Collections.reverse(A);
				return A;
				
			}else {

				int sum = A.get(i) + carry;

				if(sum> 9) {
					A.set(i, 0);
					carry = 1;
				}else {
					A.set(i, sum);
					carry = 0;
				}
			}
			if(A.size()-1 == i && carry==1) {
				A.add(0);
			}
		}
		
		
		
		Collections.reverse(A);
	
		
		return A;
	}
}
