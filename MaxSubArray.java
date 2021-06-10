package data_structure_project;

public class MaxSubArray {
	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int b = a.length;
		System.out.printf("Maximum sum of subArray is : "+ SubArray(a,b) );
	}
	
	static int SubArray(int a[], int length) {
		int Max_value = Integer.MIN_VALUE;
		//System.out.println(Max_value);
		int Sum_of_SubArray=0;
		
		for(int i=0; i<length; i++) {
			Sum_of_SubArray = Sum_of_SubArray + a[i];
			if(Sum_of_SubArray>Max_value) {
				Max_value = Sum_of_SubArray;
			}	
			if(Sum_of_SubArray< 0) {
				Sum_of_SubArray = 0;
			}
		}
		
		return Max_value;
		
	}
}
