package arraysIntroduction;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(primesum(11));
		
	}
	
	static ArrayList<Integer> primesum(int A) {
        
		int n = A;
		
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] isPrime = new boolean[A+1];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i=2; i*i<=n ; i++) {
        	for(int j = 2*i; j<=n; j+=i) {
        		isPrime[j] = false;
        	}
        }
        
        for(int i=2;i<=isPrime.length-1;i++) {
        	if(isPrime[i] && isPrime[A-i]) {       	
        			list.add(i);
        			list.add(A-i);
        			return list;
        		}
       
        }
        list.add(-1);
        return list;
        
    }

	
	
}
