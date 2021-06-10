package arraysIntroduction;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 42, 27, 16, 28, 3, 4, 
					5, 9, 3 ,31 ,5, 5, 29, 10 ,18 ,
					35, 35, 33, 19 ,41 ,23, 8 ,32, 9,
					5, 8 ,18 ,35, 13, 6 ,7, 6 ,10, 11,
					13, 37, 2 ,25, 7, 28 ,43};
		
		int n =  a.length;
		
		int result = peakElement( a, n);
		//System.out.println(n);
		System.out.println(result);
		
	}
	static int peakElement(int[] arr,int n)
    {
       //add code here.
       int start=0;
       int end=n-1;
       int leftSum = 0;
       int rightSum = 0;
       int flag =0;
       if(n==1) {
    	   return 1;
       }
       else if(n>2) {
    	   while(start<end) {
        	   
    		   if(flag==0) {
    			   rightSum+=arr[end];
    			   leftSum+=arr[start];
    			   flag=1;
    		   }
    		
    		   
    		   if(leftSum<rightSum) {
    			   start++;
    			   leftSum+=arr[start];
    		   }else {
    			   end--;
    			   rightSum+=arr[end];
    		   }
    		   System.out.println(rightSum+" "+leftSum);
    		   
    		   if(rightSum==leftSum) {
    			   return start+1+1;
    		   }
           }
       }
       //System.out.println(arr[start+1]);
       
       return -1;
		
    }

}
