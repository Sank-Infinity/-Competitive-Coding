package data_structure_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PerfectPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1, 4, 5, 3, 2};
		int m = 4;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<A.length;i++) {
			list.add(A[i]);
		}
		
		System.out.println(icecreamParlor(m ,list));
	}

	static List<Integer> 
	icecreamParlor(int m, List<Integer> arr) {
		List<Integer> list = new ArrayList<Integer>();
		
		int[] present = new int[10001];
		Arrays.fill(present, 0);
		int k = 0;
		int j = 0;
		
		for(int i=0;i < arr.size();i++) {
			
			present[arr.get(i)] = 1;
			if(m-arr.get(i)>=0) {
				if(present[m-arr.get(i)]>=1) {
					j = m-arr.get(i);
					k = i+1;
					break;
				}
			}
			
		}
		int l = 0;
		for(int i = 0; i<arr.size();i++) {
			if(j==arr.get(i)) {
				l = i+1;
			}
		}
		
		list.add(l);
		list.add(k);
		
		return list;
    }
	
}

//
//HashMap<Integer, Integer> map = new HashMap<>();
//
//for(int i = 0; i<arr.size();i++) {
//	if(map.containsKey(m-arr.get(i))) {
//		
//		int j = map.get(m-arr.get(i));
//		list.add(j);
//		list.add(i+1);
//		return list;
//		
//	}else {
//		map.put(arr.get(i), i+1);
//	}
//}

