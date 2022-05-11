import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first values :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second values :");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("The first value is grater than the second one");
		}else {
			System.out.println("The second value is greater than first one");
		}
	
	}

}
