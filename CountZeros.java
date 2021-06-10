package arraysIntroduction;

public class CountZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
		int N = Arr.length;
		System.out.println(countZeroes(Arr, N));
	}

	static int countZeroes(int[] arr, int n) {
	        // code here
		
		if(arr[n-1] == 1) 
			return 0;
		
		if(arr[0] ==0 && arr[n-1]==0) 
			return n;
		
		if(arr[n-1]==0 && arr[n-2]==1)
			return 1;
		
		int low = 0
		,high = n-1
		, total = n;
		
		while(total-->0) {
			
			int mid = (low+high) / 2;
			
			if(arr[mid]==0 && arr[mid-1]==1) 
//				System.out.println(n+" "+mid);
				return n-mid;
			
				
			if(arr[mid] == 0)
				high = mid;
			if(arr[mid]==1)
				low=mid;
			
		}
		
		
		
		return 0;
	    
	}
	
}
