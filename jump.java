package data_structure_project;

public class jump {
	public static void main(String[] args) {
		
		int a[] = { 1, 4, 3, 2, 6, 7 };
		
		System.out.print(maxSteps(a, a.length));
	}
	
	static int maxSteps(int a[], int length) {
		
		int max=0, cnt=0, step=0,maxReach=0;
		int j;
		for(int i=0;i<length;i++) {
			maxReach = a[cnt];
			for(j =i;j<maxReach;j++) {
				if(max<a[j]) {
					max = a[j];
				}
			}
			cnt = j;
			length=length-j;
			step++;
		}
		return step;
	}
}
