package arraysIntroduction;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,1,-4,5,-3,8};
		int temp = 0;
		
		for(int i=0;i<a.length;i++) {
			int min = a[i];
			for(int j=0;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					min = a[j]; 
					a[j] = a[i];
				}
				a[i] = min;
			}
			
		}
		
		for(int item: a) {
			System.out.print(item+" ");
		}
	
	}

}
