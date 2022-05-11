import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check palindrome: "  );
		int num = sc.nextInt();
		int reversednum = 0 , reminder;
		
		int originalnum = num ;
		
		while(num!=0) {
			
			reminder = num % 10;
			reversednum = reversednum * 10 + reminder ;
			num = num / 10;
			
		}
		
		if( originalnum == reversednum  ) {
			System.out.println("Given number is pallindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
		
	}

}
