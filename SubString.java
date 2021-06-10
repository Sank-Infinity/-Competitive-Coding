package arraysIntroduction;

import java.util.Scanner;


public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a[] = {4,3,1,2};
			System.out.println(minimumSwaps(a));
		}	
	
	static int minimumSwaps(int[] arr) {
		
		int cnt=0;
				
		for(int i=0;i<arr.length;i++) {
			int min = arr[i];
			int index = 0;
			for(int j =i ; j<arr.length;j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			
			if(min!=arr[i]) {
				int temp = arr[i];
				arr[i] = min;
				arr[index] = temp;
				cnt++;
			}
			
			
		}
		
		return cnt;


    }

	
	
	}


