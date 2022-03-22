// Java Program to check if a vowel is present in the string?

public class III_SearchVowels {

	public static boolean stringContainsVowels(String str) {
		
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "TV";
		
		System.out.println(stringContainsVowels(str1));
		System.out.println(stringContainsVowels(str2));

	}

}
