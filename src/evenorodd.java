import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the  numbers");
		int num = sc.nextInt();
		
		//System.out.println("Please enter num value is : " + num);
		
		
		if(num % 2  ==0) {
			System.out.println("it's a even number");
		}else {
			System.out.println("it's a odd number");
		}

	}

}
