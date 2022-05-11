import java.util.Scanner;

public class Armstrongnumof3Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide a number to find the Armstrong number : ");
		int number =sc.nextInt(); 
				int reminder;
		double result = 0;
		
		int originalnum =number;
		
		while(originalnum!=0) {
			
			reminder = originalnum % 10;
			result = result + Math.pow(reminder, 3);
			originalnum = originalnum / 10;
		}
		
		if(result == number) {
			System.out.println("Given number is Armstrong number");
		}else {
			System.out.println("Given number is not a Armstrong Number");
		}

	}

}
