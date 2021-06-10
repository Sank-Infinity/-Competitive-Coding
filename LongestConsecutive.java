package arraysIntroduction;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {105, 120, 136, 44, 26,
				122, 65, 108, 16 ,82, 58 ,
				124, 37, 62, 24 ,0, 36, 52 ,
				99 ,179 ,150, 68 ,71 ,173, 131,
				81, 130, 133, 94, 60, 163, 199,
				181, 196, 159, 13, 190, 95, 126,
				66, 84, 140, 90, 176, 142, 107,
				45, 156, 18, 87, 12 ,148, 172 ,
				59, 9, 10, 187, 6, 101, 113 ,121,
				55, 19, 104, 139, 11, 67, 28,
				127, 184, 22, 69, 30, 92 ,72, 50, 
				25, 185, 40};
		
		int N = arr.length;
		
		System.out.println(findLongestConseqSubseq(arr, N));
	}

	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
		int ans = 0;
		if(N==1) {
			return 1;
		}
		
		TreeMap<Integer,Integer> map = new TreeMap<>();

		for(int i=0; i<N ;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int g=0;

		int[] result = new int[map.size()];
		for(int bit : map.keySet()) {
			result[g] = bit;
			g++;
		}
		
		int cnt =1;

		for(int i=0; i<result.length-1; i++) {

			if(result[i]+1==result[i+1]) {
				cnt +=1;
			}
			else {
				cnt = 1;
			}
			ans = Math.max(ans, cnt);
		}
		
		return ans;
	}
	
}
