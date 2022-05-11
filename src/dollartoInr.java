import java.util.Scanner;

public class dollartoInr {

	public static void main(String[] args) {
		float rupees;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the ruppes value");
		rupees = sc.nextLong();
		
		double dollar =  (rupees / 76.36);
		System.out.println("The dollar value is :" + dollar);
		

	}

}
