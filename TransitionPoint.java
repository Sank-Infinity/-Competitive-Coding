package arraysIntroduction;

public class TransitionPoint {
	
	public static void main(String[] args) {
		
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 
				8 ,9, 10, 11, 12, 13 ,
				15 ,17 ,18 ,19 ,20 ,21, 
				22 ,25 ,26, 27, 29, 31 ,
				32 ,33 ,35 ,36 ,40 ,41, 42,
				43 ,46 ,47, 48, 51, 54, 55, 56, 57, 
				58 ,61 ,63 ,64 ,65 ,67, 69, 71 ,74 ,
				77 ,78, 79, 80, 81, 82, 83, 85 ,
				86 ,87 ,88 ,89, 90 ,91, 93 ,95 ,99, 100 };
		int k = 100;
		int N = arr.length;
		int result =  transitionPoint( arr, N, k);
		System.out.println(result);
	}
	
	static int transitionPoint(int arr[], int n, int k) {
	    // code here
		int lb = 0 , ub = n-1;
		int cnt = 0 ;
		
        while(lb<=ub){
            int mid = (lb+ub)/2;
            if(arr[mid]==k)
                return mid;
            if(arr[mid]<k)
                lb = mid+1;
            else if(arr[mid] > k)
                ub = mid-1;
            if(cnt == 13)
            	return -1;

            cnt++;
        }
      
        return -1;
	}
	
	
}
