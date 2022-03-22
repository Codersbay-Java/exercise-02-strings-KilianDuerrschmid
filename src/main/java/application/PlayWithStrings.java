package application;

import java.util.Arrays;

public class PlayWithStrings {
	public static void main(String[] args) {
		String firstname = "Kilian";
		String lastname = "Duerrschmid";

		printInitials(firstname, lastname);

		String value1 = "parliament";
		String value2 = "partial men";

		System.out.println(areAnagrams(value1, value2));

		String value = "evacanIseebeesinaca ve";
		System.out.println(isPalindrome(value));
	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out. (sysout)
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printInitials(String firstname, String lastname) {
		System.out.println(firstname.substring(0, 1) + lastname.substring(0, 1));
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {

		value1 = removeJunk(value1);
		value2 = removeJunk(value2);

		if (value1.length() == value2.length()) {

			char[] charArr1 = value1.toCharArray();
			char[] charArr2 = value2.toCharArray();

			Arrays.sort(charArr1);
			Arrays.sort(charArr2);

			boolean anagram = Arrays.equals(charArr1, charArr2);

			if (anagram) {
				return true;
			}

		}
		return false;

// add ascii values and see if they are equal

//		int asc1 = 0;
//		int asc2 = 0;
//
//		value1 = removeJunk(value1);
//		value2 = removeJunk(value2);
//
//		if (value1.length() == value2.length()) {
//
//			for (int i = 0; i < value1.length(); i++) {
//				asc1 += value1.codePointAt(i);
//			}
//
//			for (int i = 0; i < value2.length(); i++) {
//				asc2 += value2.codePointAt(i);
//			}
//
//			if (asc1 == asc2) {
//				return true;
//			}
//		}
//		return false;

	}

	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		value = removeJunk(value);

		String reverted = new StringBuilder(value).reverse().toString();

		return value.equalsIgnoreCase(reverted);
	}

	public static String removeJunk(String input) {
		StringBuilder builder = new StringBuilder();
		char[] chars = input.toCharArray();

		for (char c : chars) {
			if (Character.isLetter(c)) {
				builder.append(c);
			}
		}

		return builder.toString();
	}
}
