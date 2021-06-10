package arraysIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class NobelInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(solve(list));
		
		
	}

	static int solve(ArrayList<Integer> A) {
		
		TreeMap<Integer, Integer> tree = new TreeMap<>();
		
		for(int i=0; i<A.size();i++) {
			tree.put(A.get(i), tree.getOrDefault(A.get(i), 0)+1);
		}
		
		int max = 0;
		int i=0;
		int[] frequency = new int[tree.size()];
		int[] nobels = new int[tree.size()];

		for(int result: tree.values()) {
			frequency[i] = result;
			i++;
		}
		
		int j=0;
		for(int result: tree.keySet()) {			
			nobels[j] = result;
			j++;
		}
		
		for(int k=0; k<nobels.length-1;k++) {
			if(nobels[k] == frequency[k+1]) {
				if(max<nobels[k]) {
					max = nobels[k];
				}
			}
		}
		
		
		return max;
    }
}
