//Java program to replace any desired character in a String.
public class VII_ReplaceAnyCharInString {

	public static void main(String[] args) {
		String str = "My name is Josh";
		char[] charArray = str.toCharArray();
		
		StringBuilder out = new StringBuilder();
		char oldChar = 'i', newChar = 'x';
		
		for(char c : charArray) {
			if(c == oldChar) {
				out.append(newChar);
			}
			else {
				out.append(c);
			}
		}
		System.out.println(out.toString());
 
	}

}
