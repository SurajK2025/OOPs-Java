// Java program to remove leading and trailing white spaces from a string.
public class V_RemoveTrailingWhitespaces {

	public static void main(String[] args) {
		String s = "  abc  def\t";
		
		System.out.println(s.trim());
		
		//Added in Java11. Recommended.
		System.out.println(s.strip());

	}

}
