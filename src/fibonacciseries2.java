
public class fibonacciseries2 {
	
	static int fibo(int n) {
		
		if(n<=1)
		return n;
		
		return fibo(n-1)+fibo(n-2);
		
	}

	public static void main(String[] args) {
		
		int N=10;
		for(int i=0; i<=N ;i++) {
			System.out.println(fibo(i)+" ");
		}

	}

}
