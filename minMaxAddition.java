package data_structure_project;

public class minMaxAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1, 3, 4, 1};
		System.out.println(solve(A));
	}

	 static int solve(int[] A) {
		 int addition = 0;
		 
		 if(A.length==1) {
			 return (A[0]+A[0]);
		 }
		 
		 if(A.length==2) {
			 return (A[0]+A[1]);
		 }
		 
		 int min = A[0];
		 int max = A[0];
		 
		 for(int i=0; i<A.length;i++) {
			 if(min>A[i]) {
				 min = A[i];
			 }
			 if(max<A[i]) {
				 max=A[i];
			 }
		 }
		 
		 return min+max ;
	    }
	
}
