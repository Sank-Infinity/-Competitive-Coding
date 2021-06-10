package arraysIntroduction;

import java.util.Arrays;

public class PrimeTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		boolean[] isPrime = (sieveOfEratoSthenes(100));
//		for(int i=0; i< isPrime.length;i++) {
//			if(isPrime[i])
//				System.out.println(i);
//		}
		
//		System.out.println(gcd(24, 60));
		
		System.out.println(fastPower(3,5));
		
	}
	
	
	static int gcd(int a, int b) {
		
//		if(b==0) return a;
//		
//		return gcd(b, a%b);
		
		return a%b == 0 ? b : gcd (b, a%b);
	}

	static int fastPower(int a, int b) {
		
		int res = 1;
		
		while(b>0) {
			
			if((b&1)!=0) {
				res = res * a;
			}
			
			a = a*a ;
			b = b >> 1 ; // half the value of b using right shift
		}
		
		return res;
		
	}
	
	
	static boolean[] sieveOfEratoSthenes(int n) {
		
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i=2; i*i<=n; i++) {
			for(int j= 2*i; j<=n; j+=i) {
				isPrime[j] = false;
			}
		}
		
		return isPrime;
	}
	
}
