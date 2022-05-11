
public class palindromeString {

	public static void main(String[] args) {

		String str="Radar", reverstr="";
		
		int strlength = str.length();
		
		for(int i = (strlength-1); i>=0 ; --i) {
			reverstr = reverstr + str.charAt(i);
		}

		if(str.toLowerCase().equals(reverstr.toLowerCase())) {
			System.out.println(str + " Given string is palindrome string");
		}else {
			System.out.println(" Given string is not palindrome string");
		}
	}

}
