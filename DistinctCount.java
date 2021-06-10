package data_structure_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,2,1,3,4,2,3};
		int n = A.length;
		int k = 4;
		
		
		System.out.println(countDistinct(A, n, k));
		
	}
	
	 static ArrayList<Integer> countDistinct(int A[], int n, int k)
	    {
		 	ArrayList<Integer> list = new ArrayList<>();
		 	HashMap<Integer, Integer> map = new HashMap<>();
		 	
		 	for(int i=0; i<=k-2;i++) {
		 		map.put(A[i], map.getOrDefault(A[i], 0) +1 );
		 	}
		 	
		 	for(int j=0, i=k-1; i<A.length; ) {
		 		map.put(A[i], map.getOrDefault(A[i], 0)+1);
		 		list.add(map.size());
		 		
		 		int frequency = map.get(A[j]);
		 		
		 		if(frequency==1) {
		 			map.remove(A[j]);
		 		}else {
		 			map.put(A[j], frequency-1);
		 		}
		 		i++;
		 		j++;
		 	}
		 	
		 	return list;
		 
	    }

}


/*
 * //code here 
		  ArrayList<Integer> alist = new ArrayList<>();
		  ArrayList<Integer> tempList = new ArrayList<>();
		  
//		  System.out.println("welcome");
		  
		  int slider = 0;
		  int slow=0;
		  
		  for(int i=0;i<n ;i++) {
			
			tempList.add(A[i]);
//			System.out.println(tempList);
			slider+=1;
			if(slider >= k) {
				
				HashSet<Integer> set = new HashSet<>(tempList);
				alist.add(set.size());
//				System.out.println("-------set-------"+set);
				
				tempList.remove(slow);
				
//				System.out.println(slow+ " "+tempList);
//				System.out.println("------answer------"+alist);
			
			}
			
			
			  
		  }
		  
		  
		  
		  return alist;
 * 
 * */
