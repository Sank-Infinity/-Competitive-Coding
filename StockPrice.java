package arraysIntroduction;

import java.util.ArrayList;

public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,1,5,3,6,4};
		int N = arr.length;
		
		System.out.println(inversionCount( arr,  N));
		
	}

    static int inversionCount(int arr[], int N) {
		
    	int maxProfit = 0;
    	int minSofar = arr[0];
    	
    	
    	for(int i=1; i<N;i++) {
    		
    		if(minSofar>arr[i]) {
    			minSofar = arr[i];
    		}
    		
    		if(maxProfit< arr[i]-minSofar) {
    			maxProfit = arr[i]-minSofar;
    		}
    		
    		
    	}
    	
    	return maxProfit;
    	
    	/* int maxProfit = -1;
    	int[] auxArray = new int[N];
    	int max = arr[N-1];
    	
    	for(int i=N-1; i>=0; i--) {
    		max = Math.max(max, arr[i]);
    		auxArray[i] = max;
    	}
    	
    	for(int i=0; i<N;i++) {
    		if(maxProfit< auxArray[i]-arr[i]) {
    			maxProfit =  auxArray[i]-arr[i];
    		}
    	}
    	
    	return maxProfit;*/
    	
	}
	
}
