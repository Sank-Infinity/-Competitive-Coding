package arraysIntroduction;

import java.util.Arrays;


public class Solution {
	
    public static void main(String[] args) {
     
    	int[] A = {1,4,2,3,8,5,5,3,4,4,4};
    	Arrays.sort(A);
    	int cnt;
    	int maxCount=0;
    	
    	for(int i=0;i<A.length;i++) {
    		cnt = 0;
    		for(int j=0;j<A.length;j++) {
    			
    			if(A[i]==A[j]) {
    				cnt++;
    			}
    			
    		}
    		if(cnt==A[i]) {
    			if(maxCount<cnt)
    				maxCount=cnt;
    		}
    	}
     
    	System.out.println(maxCount);
    }
}
