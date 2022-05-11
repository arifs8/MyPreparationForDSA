import java.util.Scanner;

public class fibonaciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a=0;
		int b=1;
		
		System.out.println("Enter the N value : ");
		int n = sc.nextInt();
		
		System.out.println("The Fibonaci series value is :");

		while(sum<=n) {
			a   = b;
			b   = sum;
			sum = a+b;
			
			System.out.print( sum+ " ");
		}
		
	}

}
