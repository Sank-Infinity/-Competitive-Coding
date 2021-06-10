package arraysIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int arr[] = {0, -1, 2, -3, 1};
		boolean result = findTriplets( arr ,  n);
		
		if(result) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	static boolean findTriplets(int arr[] , int n)
    {
        boolean result = false;
        
        int targetSum = 0;
        
        Arrays.sort(arr);
        ArrayList<List<Integer>> list = new ArrayList<>();
 
        
        
        for(int i=0;i<n; i++) {
        	int sum = targetSum - arr[i];
        	//System.out.println(sum);
        	int start = i+1;
        	int end = n-1;
        	
        	while(start<end) {
        		int t = arr[start] + arr[end];
//        		System.out.println(sum+" "+t);
        		if(t==sum) {
        			list.add(Arrays.asList(arr[i],arr[start],arr[end]));
        			start+=1;
            		end-=1;
        		}else if(t<sum) {
        			start++;
        		}else {
        			end--;
        		}
        		if(list.size()>0) {
        			//System.out.println(list);
        			return true;
        		}
        		
        	}
        	
        }
//        System.out.println("Im running");
        return false;
    }

}
