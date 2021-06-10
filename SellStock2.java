package arraysIntroduction;

import java.util.HashMap;

public class SellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,1,2};
		int N = a.length;
		System.out.println(majorityElement(a, N));
	}

	static int majorityElement(int a[], int size)
    {
        // your code here
		int max_index = 0;
		int cnt = 1;
		
		for(int i=0; i<size; i++) {
			if(a[max_index]==a[i]) {
				cnt+=1;
			}else {
				cnt-=1;
			}
			if(cnt==0) {
				max_index = i;
				cnt = 1;
			}
		}

		int maxProbable = a[max_index];
		
		int count = 0;
		for(int i=0; i<size;i++) {
			if(maxProbable == a[i]) {
				count+=1;
				if(count > size/2) {
					return maxProbable;
				}
			}
		}
		return -1;
    }
	
	
//	HashMap<Integer, Integer> map = new HashMap<>();
//	
//	for(int i=0; i<size; i++) {
//		map.put(a[i], map.getOrDefault(a[i], 0)+1);
//		System.out.println(map);
//		if(size/2 < map.get(a[i]) ) {
//			return a[i];
//		}
//	}
//	
	
}
