package data_structure_project;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int temp= n ;
		int lastDigit=0 ;
		int reverseNumber = 0;
		boolean isPalindrome = true;
		
		while(temp>0) {
			lastDigit = temp%10;
			reverseNumber = reverseNumber*10 + lastDigit;
			temp = temp/10;
		}
		
		if(n == reverseNumber ) {
			System.out.println(isPalindrome);
		}
		else {
			isPalindrome = false;
			System.out.println(isPalindrome);
		}
	}
}
