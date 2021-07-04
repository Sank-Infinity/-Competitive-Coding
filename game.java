package asach;

public class game {
	
	
	public static void main (String[] args) {
		
		System.out.println(countAndSay(1211));
		
	}

	static String countAndSay(int n) {
		
		String result = "";
		
		int cnt = 0;
		int temp = n;
		int cur;
		int mycnt = 0;
		int prev = 0;
		
		while(temp!=0) {
			temp = temp/10;
			cnt+=1;
		}
		
		int flag = 0;
		int run = cnt+1;
		while(run-->0) {

			cnt-=1;
			cur = (int) (n/Math.pow(10, cnt));
			
			if(flag==0) {
				prev = cur;
				flag =1 ;
			}
			
			
			if(prev == cur) {
				mycnt+=1;
			}else {
				result+=mycnt;
				result+=prev;
				mycnt=1;
			}
			
			prev= cur;
			n = (int) (n%Math.pow(10, cnt));

		}
		
        return result;
    }
    
}
