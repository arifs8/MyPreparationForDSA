import java.util.Scanner;

public class twovaluesIfCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value :");
		int num1 = sc.nextInt();

		System.out.println("En5ter the Second Value :");
		int num2 = sc.nextInt();

		System.out.println("Pass which operator to perform");
		char op = sc.next().charAt(0);
		int sol = 0;

		switch (op) {
		case '+': {

			sol = num1 + num2;
			System.out.println("the addition value of sol is : " + sol);
			break;
		}
		case '-': {

			sol = num1 - num2;
			System.out.println("the subtraction value of sol is : " + sol);
			break;
		}
		case '*': {

			sol = num1 * num2;
			System.out.println("the multiplication value of sol is : " + sol);
			break;
		}
		case '/': {

			sol = num1 / num2;
			System.out.println("the divident value of sol is : " + sol);
			break;
		}
		default:
			System.out.println("No Such Operator");
		}

	}

}
