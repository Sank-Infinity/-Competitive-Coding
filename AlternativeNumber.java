package arraysIntroduction;

import java.util.ArrayList;

public class AlternativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[] = {-9, 4, -5, 1,-2,0};
		int N = Arr.length;
		
		rearrange(Arr, N);
		
	}

	 static void rearrange(int arr[], int n) {
	   
	   // code here
				 
		 
		 
	   ArrayList<Integer> negative = new ArrayList<>();
	   ArrayList<Integer> positive = new ArrayList<>();

	   for(int i=0; i<arr.length; i++) {
		   if(arr[i]>=0) {
			   positive.add(arr[i]);
		   }
		   else {
			   negative.add(arr[i]);
		   }
	   }
	   boolean pos = true;
	   int j=0, k=0;
	   
	   for(int i=0; i<arr.length; i++) {
		   
		   if((i%2==0 && j!=positive.size()) || (k==negative.size()&& j!=positive.size())) {
				  arr[i] = positive.get(j);
				  j++;

		   }else {
				  arr[i] = negative.get(k);
				  k++;

		   }
		   System.out.println(arr[i]);
	   }
	   
	   
	 
	}
	
}
