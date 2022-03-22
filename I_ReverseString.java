// How to reverse a String in Java?

public class I_ReverseString {

	public static String reverse(String str) {
		
		char[] c = str.toCharArray();
		StringBuilder out = new StringBuilder();
		
		for(int i=c.length-1; i>=0; i--) {
			out.append(c[i]);
		}
		return out.toString();
	}
	
	public static void main(String[] args) {
		//Using for loop and String Builder
		String str = "Hello World";	
		System.out.println(reverse(str));
		
		//Using System Buffer
		String str2 = "My name is Suraj.";
		StringBuffer sf = new StringBuffer(str2);
		System.out.println(sf.reverse());
	}

}