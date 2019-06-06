
public class OneAway {

	public static boolean oneAway(String str1, String str2) {
		int strikes = 0;
		int sizeDiff = str1.length() - str2.length();
		if(sizeDiff < 0 ) {
			sizeDiff = sizeDiff * -1;
		}
		strikes = sizeDiff;
		System.out.println(sizeDiff);
		
		for(int i = 0; i< str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				strikes+=1;
			}
			System.out.println(strikes);
			if(strikes > 1) { 
				return false;
			}
		}
		return true;
	}
		
	

	
	public static void main(String[] args) {
		System.out.println("-----------------one Away------------------");
		System.out.println(oneAway("test", "ttet"));
		System.out.println(oneAway("test", "test"));
		System.out.println(oneAway("teso", "test"));
	}
	
}
