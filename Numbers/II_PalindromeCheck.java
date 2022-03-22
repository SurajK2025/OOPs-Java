//Java program to check if given sequence is a Palindrome string.
public class VIII_PalindromeCheck {
	public static void main(String[] args) {
		boolean isPalindrome = true;
		String str = "xzyzx";
		int len = str.length();
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) {
				System.out.println("Not a palindrome.");
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Given string is a palindrome.");
		}
	}
}
