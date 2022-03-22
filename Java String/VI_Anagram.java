
public class X_Anagram {

	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
            int index = str2.indexOf(c);
            
			if(index != -1) {
				str2 = str2.substring(0, index) + str2.substring(index+1, str2.length());
			}
			else {
				return false;
			}
		
		}
		return str2.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String str1 = "java2blog";
		String str2 = "aj2vabgol";
		
		if(isAnagram(str1, str2)) {
			System.out.println(str2+" is an Anagram of "+str1);
		}
		else {
			System.out.println(str2+" is not an Anagram of "+str1);
		}
	}

}
