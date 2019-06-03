import java.util.HashSet;
import java.util.Set;

public class IsUnique {

public static boolean isUnique(String word) {
		Set<Character> letters = new HashSet<Character>();
		for(int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}
		return word.length() == letters.size();
	}
	
	public static boolean isUnique2(String word) {
		Character ch;
		for(int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			if(word.indexOf(ch) != word.lastIndexOf(ch)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------friends-------------");
		System.out.println(isUnique("friendsE"));
		System.out.println(isUnique2("friends"));
		System.out.println("--------------------we were on a break-------------");
		System.out.println(isUnique("we were on a break"));
		System.out.println(isUnique2("we were on a break"));
	}

}