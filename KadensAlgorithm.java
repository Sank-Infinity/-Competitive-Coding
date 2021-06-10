package arraysIntroduction;

public class KadensAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] a = {-1,4,5,-63,6,7,-4};
			System.out.println(maxSumSubArray(a));
	}
	
	static int maxSumSubArray(int[] a) {
		
		int maxSum = a[0];
		int curSum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			curSum = curSum + a[i];
			
			if(curSum>maxSum) {
				maxSum = curSum;
			}
			
			if(curSum<0) {
				curSum = 0;
			}
		}
		
		return maxSum;
	}

}
