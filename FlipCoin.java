package arraysIntroduction;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {1,1,1,1,1,1,1};
		int cnt=0;
		
		for(int i=0;i<A.length-1;i++) {
			if(A[i]==A[i+1] && A[i]==0) {
				A[i+1] = 1;
				cnt++;
			}
			
			if(A[i]==A[i+1] && A[i]==1) {
				A[i+1] = 0;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
