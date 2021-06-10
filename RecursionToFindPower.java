package data_structure_project;

public class RecursionToFindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findPower(10,10));
		
	}

	static long findPower(long a, long b) {
		
		if(b==0) {
			return 1;
		}
		
		if(b==1) {
			return a;
		}
		
		return a * findPower(a, b-1);
	}
	
}
