package arraysIntroduction;

public class TotalBishopMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(4,1));
		
	}
	
	static int solve(int A, int B) {
		
		int a1 = A*B; 
		int result1 = Math.min(A, B)-1;
		
		int a2 = ((8-A)+1)*B;
		int result2 = Math.min(((8-A)+1), B)-1;
		
		int a3 = ((8-B)+1)*A;
		int result3 = Math.min(((8-B)+1), A)-1;
		
		int a4 = ((8-B)+1)*((8-A)+1);
		int result4 = Math.min(((8-B)+1) , ((8-A)+1)) - 1;
		 
		return(result1+result2+result3+result4);
		
//		return 0;
    }
}
