package arraysIntroduction;

import java.util.ArrayList;


public class LargeFact {

	 static int MOD = 1000000007 ;
	   
	 public static long[] factorial(long a[], int n) {
	        // code here
		 long[] result = new long[n];
		 ArrayList<Long> list = new ArrayList<>();
	        int max = 0;
	        list.add((long) 1);
	        
	        for(int i=0; i<n;i++){
	            max = (int) Math.max(a[i], max);
	        }
	       
	        for(int i=1 ; i<=max ; i++) {
	        	list.add((list.get(i-1)*i)%MOD);
	        }
	        
	        for(int i=0; i<n; i++) {
	        	result[i] = (list.get((int) a[i]));
	        }
	        
	        return result;
	    }

	public static void main(String args[])
	{ 

	    long arr[] = {3, 10, 200, 20, 12}; 
	    int n = arr.length; 


	    long result[] = factorial(arr,n); 
	    for(int i=0; i<result.length;i++) {
	    	System.out.print(result[i]+" ");
	    }
	}
}
