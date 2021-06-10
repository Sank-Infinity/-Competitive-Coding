package data_structure_project;

import java.util.ArrayList;

public class philaland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int MaxPrice = 0;
		int sum = 0;
		ArrayList<Integer> alist = new ArrayList<>();
		
		if(MaxPrice==1) {
			alist.add(1);
			System.out.println(alist);
			return;
		}
		
		if(MaxPrice==0) {
			alist.add(0);
			System.out.println(alist);
			return;
		}
		
		for(int i=1;i<MaxPrice;i++) {
			sum+=i;
			alist.add(i);
			if(sum>=MaxPrice) {
				break;
			}
		}
		System.out.println(alist);
	}

}
