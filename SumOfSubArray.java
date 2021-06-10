package arraysIntroduction;

import java.util.ArrayList;
import java.util.List;


public class SumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> list=new ArrayList<Integer>(); 		
		int[] A =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		
		
		int OverAllmaxSum = A[0];
		int maxSumTillNOw = 0;
		
		for(int i=0;i<A.length;i++) {
			maxSumTillNOw = 0;
			for(int j=i;j<A.length;j++) {
				maxSumTillNOw+=A[j];
				
				if(maxSumTillNOw>OverAllmaxSum)
					OverAllmaxSum = maxSumTillNOw;
				
			}
			
		}
		
		System.out.println(OverAllmaxSum);
		
	}

}
