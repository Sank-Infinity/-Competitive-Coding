package arraysIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 3, 2, 1, 3};
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		
		System.out.println(repeatedNumber(list) );
		
	}

	static int repeatedNumber(final List<Integer> A) {
		
		int[] pl = new int[A.size()];
		for(int i=0; i<A.size();i++) {
			pl[i] = A.get(i);
		}
		
		Arrays.sort(pl);
		
		if(pl.length==1 || pl.length == 0) {
			return -1;
		}
		
		for(int i=0;i<pl.length-1;i++) {
			if(pl[i]==pl[i+1]) {
				return pl[i];
			}
		}
		
		return -1;
		
    }
	
}
