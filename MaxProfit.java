package arraysIntroduction;

import java.util.ArrayList;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = {2,1,4};
		System.out.println(maxProfit(prices));;
	}

	static int maxProfit(int[] prices) {
	
		int maxProfit= 0;
		int minimalStock = prices[0];
		int minStockPtr=0;
		int maxStockPtr=0;
		int n= prices.length-1;
        
         if(prices.length==2) {
 			if(prices[0]<prices[1]) {
 				return (prices[1]-prices[0]);
 			}
 			return 0;
 		}
    
        while(n-->0) {
				
				if(minimalStock > prices[minStockPtr]) {
					minimalStock = prices[minStockPtr];
					if(minStockPtr < prices.length) {
						maxStockPtr = minStockPtr+1;
					}
				}
				
				if(maxProfit < prices[maxStockPtr] - minimalStock) {
					maxProfit = prices[maxStockPtr] - minimalStock;
				}
			
				minStockPtr+=1;
				maxStockPtr+=1;
				
			}
			
		
		return maxProfit;
        
        
		
//		return list;
		
//		for(int i=0;i<prices.length;i++) {
//			for(int j=i+1;j<prices.length;j++) {
//				if(max<prices[j]-prices[i]) {
//					max = prices[j]-prices[i];
//				}
//				
//				
//			}
//		}
//		
//		return max;
		
	}
}
