package data_structure_project;

public class sortArray {
	public static void main(String[] args) {
		
		int a[] = {1, 3, 5, 7};
		int b[] = {0, 2, 6, 8, 9};
		
		int length = a.length+b.length;
		int c[] =new int[length];
		
		int i,j,k,cnt=0;
		
		for(i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		
		//System.out.println(i);
		for(j=i;j<length;j++) {
			c[j] = b[cnt];
			cnt++;
		}
		
		sort(c, length);
	}
	
	static int[] sort(int c[], int length) {
		
		int temp;
		for(int t=0;t<length;t++) {
			System.out.print(c[t]);
		}
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(c[i]>c[j]) {
					temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		System.out.println();
		for(int t=0;t<length;t++) {
			System.out.print(c[t]);
		}
		
		return c;
	}
	
}
