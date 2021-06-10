package data_structure_project;
import java.util.*;

public class PieceOfCake {

	public static void main(String[] main) {
		
		Scanner read = new Scanner(System.in);
		int h = read.nextInt();
		int w = read.nextInt();
		
		int[] horizontalCut = {1,2,4};
		int[] verticalCut = {1,3};
		
		Cuts(h, w, horizontalCut,verticalCut);
		
	}
	
	public static int[] addX(int n, int arr[], int element) {
		
		int[] newArr = new int[arr.length+1];
		int p = 0;
		
		for(int i=0;i<arr.length+1;i++) {
			if(i==n) {
				newArr[i] = element;
			}else
			{
				newArr[i]=arr[p];
				p++;
			}
		}
		
		return newArr;
		
	}
	
	public static void show(int arr[]) {
		int n = arr.length;
		
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static int max(int a, int b) {
		int max=0;
		if(a<b) {
			max = b;
		}else {
			max = a;
		}
		
		return max;
	}
	
	public static void Cuts(int h, int w, int horizontalCut[], int verticalCut[]){
		
		horizontalCut = addX(0,horizontalCut,0);
		horizontalCut = addX(horizontalCut.length,horizontalCut,h);
		
		verticalCut = addX(0,verticalCut,0);
		verticalCut = addX(verticalCut.length,verticalCut,w);
		
		//show(horizontalCut);
		//show(verticalCut);
		
		int horizontalMax = 0;
		
		for(int i=0;i<horizontalCut.length-1;i++){
			horizontalMax = max(horizontalCut[i+1]-horizontalCut[i],horizontalMax);
		}
		
		int verticalMax = 0;
		
		for(int i=0;i<verticalCut.length-1;i++){
			verticalMax = max(verticalCut[i+1]-verticalCut[i],verticalMax);
		}
		System.out.println(verticalMax * horizontalMax);
	}
	
}


