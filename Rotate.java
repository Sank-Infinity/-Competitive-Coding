package arraysIntroduction;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,3,4,5};
		
		int N = arr.length, D = 2;
		rotateArr(arr, D, N);
	}

	 static void rotateArr(int arr[], int d, int n)
	    {
	        // add your code here
	        int p = 0;
	        int j= 0;
	        int[] result = new int[n];
	        for(int i=d; i<n+d ;i ++){
	            if(i<n) {
	            	result[j] = arr[i];
	            	System.out.println(result[j]);
	            }else {
	            	result[j] = (arr[p]);
	            	System.out.println(result[j]);
	            	p++;
	            }
	            j++;
	        }
	        for(int i=0; i<n ;i++) {
	        	
	        	arr[i] = result[i];
	        	
	        }
	      
	    }
	
}
