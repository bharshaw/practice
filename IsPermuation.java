import java.util.Arrays;

public class IsPermuation {

	/*This solution is O(n)
	*I use StringBuilder because I can more efficiently delete a single
	*Character from the second string. In order to delete a Character
	*from a String you have to substring, and concatenate before and after
	*the character. Each time this is done, the string would be getting
	*recreated since strings are immutable
	*/
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) { return false; }
		
		StringBuilder strBuilder = new StringBuilder(str2);
		
		for(int i = 0; i<str1.length(); i++) {
			String str = Character.toString(str1.charAt(i));
			if(strBuilder.indexOf(str) == -1) {
				return false;
			}else {
				strBuilder.deleteCharAt(strBuilder.indexOf(str));
			}
		}
		return true;
	}
	
	//This solution is quicker than the above solution because the sorting only takes O(log n)
	// this approach requires more space though because we need two arrays to store the Characters in each string
	public static boolean isPermutation2(String str1, String str2) {
		if(str1.length() != str2.length()) { return false; }
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1,  ch2);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("-------------is Permutation---------------");
		System.out.println(isPermutation("The dog ran", "ran dog The"));
		System.out.println(isPermutation2("cat", "car"));
	}
	
}
