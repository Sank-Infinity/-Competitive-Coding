package arraysIntroduction;

public class maxNumberOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
		int N = arr.length;
		int M = 2;
		
		System.out.println(findZeroes(arr, N, M));
		
	}
	
	static int findZeroes(int arr[], int n, int m) {
        // code here
		int j = -1;
		int cnt = 0;
		int ans = 0;
	
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				cnt+=1;
			}
			
			while(cnt>m) {
				j++;
				if(arr[j]==0)
					cnt--;
			}
			
			int len = i-j;
			ans = Math.max(len, ans);
		}
		
		return ans;
    }
	

}




//if(arr[i]==1 || flip!=0) {
//	cnt+=1;
////	System.out.println("cnt"+cnt);
//	if(arr[i]==0)
//		flip-=1;
////	System.out.println("flip"+flip);
//	if(i!=n-1) {
//		if(arr[i]==0 && arr[i+1]==1)
//			stopped = i+1;
//	}
////	System.out.println("stopped"+stopped);
////	System.out.println("index"+i);
//	i++;
//}else {
//	
////	System.out.println("maxCnt"+maxCnt);
//	i = stopped;
//	cnt = 0;
//	flip = m;
//}

