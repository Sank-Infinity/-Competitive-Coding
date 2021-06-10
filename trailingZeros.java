package arraysIntroduction;

public class trailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 243;
		System.out.println(Trailing(n));
	}
	
	static int Trailing(int n) {
		
		int res = 0;
		for(int i=5; i<n ;i = i *5) {
			res = res + n/i;
		}
		return res;
	}

}
