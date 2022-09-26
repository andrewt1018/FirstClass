public class Palindrome{
	public static void main(String args[]){
		System.out.println("Racecar is a palindrome: " + 
											isPalindrome("racecar"));
		System.out.println(" is a palindrome: " + isPalindrome(""));
		System.out.println("Null is a palindrome: " + isPalindrome(null));
		System.out.println("Andrew is a palindrome: " + isPalindrome("Andrew"));
}
	private static String reverse(String s){
		int len = s.length();
		String result = "";
		if (s == null || len < 1){
			return "";	
		} else if (len == 1) {
			return s;
		}
		
		for (int i = 1; len - i >= 0; i++){
			result += s.charAt(len - i);
		} 
		return result;
	}
	
	private static boolean isPalindrome(String s){
		if (s == null){
			System.out.println("The given string is null.");
			return false;
		}
		String compare = reverse(s);
		if (compare.equals(s))
			return true;
		else
			return false;
	}
}
