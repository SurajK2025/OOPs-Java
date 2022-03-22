// Java program to remove all white spaces from a string.
public class VI_RemoveAllWhitespaces {

	public static void main(String[] args) {
		String str = "Hello my name is John";
		char[] charArray = str.toCharArray();
		
		StringBuilder out = new StringBuilder();
		
		for(char c : charArray) {
			if(Character.isWhitespace(c)) {
				continue;
			}
			else {
				out.append(c);
			}
		}
		System.out.println(out.toString());
	}

}
