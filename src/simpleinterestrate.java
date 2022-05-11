import java.util.Scanner;

public class simpleinterestrate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the Principle , time and rate values");
		int prince = sc.nextInt();
		System.out.println("Principal Amount is: " + prince);
		int rate = sc.nextInt();
		System.out.println("rateof interest  is: " + rate);
		int time = sc.nextInt();
		System.out.println("Time period is: " + time);
		int simpleinterest = (prince*rate*time)/100;
		
		System.out.println("the simpleinterest value is : " + simpleinterest);

	}

}
