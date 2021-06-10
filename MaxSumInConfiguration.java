package arraysIntroduction;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class MaxSumInConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {887, 778, 916 ,794, 336 ,387, 493,
				650, 422, 363 ,28 ,691, 60 ,
				764, 927 ,541 ,427 ,173, 737 ,
				212 ,369 ,568 ,430, 783 ,531 ,
				863, 124 ,68, 136 ,930, 803 ,
				23 ,59, 70, 168, 394 ,457 ,12, 43,
				230, 374, 422, 920, 785,538, 199 ,
				325 ,316, 371, 414, 527, 92 ,981,
				957, 874, 863 ,171, 997, 282, 306, 
				926, 85, 328 ,337, 506, 847,730 ,
				314, 858, 125, 896 ,583, 546 ,815 ,368 ,
				435 ,365, 44 ,751, 88, 809, 277, 179, 789};
		
		int N = A.length;
		
		System.out.println(max_sum(A, N));;
		
	}

	static int max_sum(int arr[], int n)
    {
		 	int cum_sum = 0;
		 	int curr_val = 0;
		 	
	        for (int i = 0; i < n; i++) {
	        	cum_sum += arr[i];
	        	curr_val += i * arr[i];
	        }
	     
	        int res = curr_val;

	        for (int i = 1; i < n; i++)
	        {
	            int next_val = curr_val - (cum_sum -
	                          arr[i-1]) + arr[i-1] *
	                          (n-1);

	            curr_val = next_val;
	            res = Math.max(res, next_val);
	        }

	        return res;
    }
	
}


//ArrayList<Integer> list = new ArrayList<>();
//
//
//for(int i=0;i<n;i++) {
//	list.add(A[i]);
//}
//
//int maxSum = 0;
//
//for(int i=0; i<n;i++) {
//	int sum = 0;
//	for(int j=0; j<n;j++) {
//		sum += list.get(j)*j;
//	}
//	if(sum>maxSum) {
//		maxSum = sum;
//	}
//	int t = list.remove(0);
//	list.add(t);
//}
//
//
//return maxSum;