package arraysIntroduction;

import java.util.ArrayList;
import java.util.TreeMap;

public class SmallestMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(-5);
		
		System.out.println(missingNumber(list));
	}

	//Function to find the smallest positive number missing from the array.
    static int missingNumber(ArrayList<Integer> A)
    {

        int n = A.size();
        for(int i=0; i<n;i++) {
        	int currentPos = A.get(i) - 1;
        	while( 1<= A.get(i) && A.get(i) <= n && A.get(i) != A.get(currentPos)) {
        	
        		int temp = A.get(currentPos);
        		A.add(currentPos, A.get(i));
        		A.add(i, temp);
        		currentPos = A.get(i)-1;
        	}
        }
        
        for(int i=0; i<A.size();i++) {
        	if(i+1!=A.get(i)) {
        		return i+1;
        	}
        }
        
        return A.size()+1;
    }
	
}
