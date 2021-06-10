package arraysIntroduction;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int A[] = {1, 1, 2, 0, 2, 0, 1, 1, 1};
 
		int N = A.length;
		
		System.out.println(canReach(A, N));
		
	}

	 static int canReach(int[] A, int N) {
	        // code here
		 
		 int reachable = 0;
		 
		 for(int i=0; i<N; i++) {
			 if(reachable < i) {
				 return 0;
			 }
			 reachable = Math.max(reachable, i + A[i]);
		 }
		 
		 return 1;
	 }
	
}
