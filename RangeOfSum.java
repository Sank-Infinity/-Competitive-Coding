package arraysIntroduction;

import java.util.ArrayList;

public class RangeOfSum {

	public static void main(String[] args) {
		int N = 5;
		int S = 12;
		int A[] = {1,2,3,7,5};
		
		int sum = 0;
		boolean isSum = true;
		        
		int left = 0;
		int right = 0;
		ArrayList<Integer> result = new ArrayList<>();
		        
		while(isSum) {
			sum+=A[right];
		    result.add(right+1);
		    right++;
		    
		    if(sum==S) {
		    	int first = result.get(0);
		        int last = result.get(result.size()-1);
		        result.clear();
		        result.add(first);
		        result.add(last);
		        System.out.println(result);
		        System.exit(0);
		                		    	
		    }
		    if(right==A.length) {
		    	left++;
		        right = left;
		        result.clear();
		        sum = 0;
		    }
		    if(left==A.length) {
		    	isSum = false;
		        result.clear();
		        result.add(-1);
		    }
		                
		     
		}
		        
		System.out.println(result);             
		
		
	}
}
