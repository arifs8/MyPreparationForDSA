import java.util.Scanner;

public class greetingMessage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the greetings name: ");
		
		String name =sc.nextLine();
		System.out.println("happy Birthday " + name);
		

	}

}
