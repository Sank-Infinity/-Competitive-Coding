package arraysIntroduction;

import java.util.ArrayList;

public class MinimumDistance {

	public static void main(String[] args) {

		int N = 12;
		int[] A = {86,39,90,55,12,33,67,84,66,62,90,85};
		int x = 90;
		int y = 66;
		
		int result = minDist( A,  N,  x,  y);
		System.out.println(result);
		
	}
	
	static int minDist(int a[], int n, int x, int y) {

		int cnt = 0;
		
		int j =0;
		int min =0;
		
		int flag = 0;
		int xIndex=0;
		int yIndex=0;
		
		while(n-->0) {
			
			if(a[j]==x) {
					xIndex = j+1;
					//System.out.println("X index "+xIndex);
			}
			
			if(a[j]==y) {
				yIndex=j+1;
				//System.out.println("Y index "+yIndex);
			}
			
			if(yIndex!=0 && xIndex!=0) {
				if(flag==0)
					min = Math.abs(xIndex-yIndex);
					flag = 1;
				if(min>Math.abs(xIndex-yIndex))
					min = Math.abs(xIndex-yIndex);
			}
			j++;	
		}
		
		if(min==0)
			return -1;
		
		return min;
    }
}
