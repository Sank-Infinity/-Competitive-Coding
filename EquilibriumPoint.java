package data_structure_project;

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		int a[] = {20, 17, 42, 25, 32, 32 ,
					30, 32, 37, 9 ,2, 33,
					31, 17 ,14, 40, 9, 
					12, 36 ,21, 8, 33 ,6,
					6, 10 ,37 ,12, 26, 21, 3};
		int n = a.length;
		System.out.println(equilibriumPoint(a,n));
		
	}
	
	static int equilibriumPoint(int  a[], int n) {

		if(n==1) {
			return a[0];
		}
		if(n==2) {
			return -1;
		}
		
		boolean myLocation = true;
		
		int left = 0;
		int right = n-1;
		int leftSum = a[left];
		int rightSum = a[right];
		
		
		while(myLocation) {
		
						
			if(leftSum>rightSum) {
				right--;
				rightSum+=a[right];
			}
			
			if(leftSum<rightSum) {
				left++;
				leftSum+=a[left];
			}
			
			System.out.println();
			System.out.println(left +"--->"+leftSum + " " +right+"--->"+ rightSum);
			
			if(left>right || left==right) {
				myLocation = false;
//				System.out.println(a[right-1]);
//				System.out.println(a[right-1]);

				
			}
			
			if(rightSum==leftSum && left+1 == right-1) {
				return a[left+1];
			}
			
			if(rightSum==leftSum && left+1 != right-1) {
				left+=1;
				right-=1;
				leftSum+=a[left];
				rightSum+=a[right];
			}	
	
		}
		
		
		
		return -1;
	 }
	
}
