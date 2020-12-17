package StringMethods;

import java.util.Arrays;
import java.util.Base64;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split 
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {

		int sOne = s1.length();
		int sTwo = s2.length();
		if (sOne > sTwo) {
			return s1;
		}
		if (sTwo > sOne) {
			return s2;
		}
		return "equal";
	}

	// if String s contains the word "underscores", change all of the spaces to
	// underscores
	public static String formatSpaces(String s) {
		if (s.contains("underscores")) {
			s = s.replace(" ", "_");

			return s;
		}

		return s;
	}

	// Return the name of the person whose LAST name would appear first if they were
	// in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
		int c12 = s1.compareToIgnoreCase(s2);
		int c23 = s2.compareToIgnoreCase(s3);
		int c13 = s1.compareToIgnoreCase(s3);

		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();

		String last1 = s1.split(" ")[1];

		String last2 = s2.split(" ")[1];

		String last3 = s3.split(" ")[1];

		if (last1.compareTo(last2) < 0 && last1.compareTo(last3) < 0) {
			return s1;
		} else if (last2.compareTo(last1) < 0 && last2.compareTo(last3) < 0) {
			return s2;
		} else if (last3.compareTo(last2) < 0 && last3.compareTo(last1) < 0) {
			return s3;
		}

		return null;
	}

	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
			String temp= s.substring(i, i+1);
			sum += Integer.parseInt(temp);
			} 
		}
		return sum;
	}


	// Return the number of times String substring appears in String s
	
	//WORK ON THIS NEXT TIME
	public static int substringCount(String s, String substring) {
int string= s.length();
int times= substring.length();

int temp=0;
for (int i = 0; i <= times-string; i++) {
for (int j = 0; j < string; j++) {
	if(substring.charAt(i+j)!=s.charAt(j)) {
		break;
	}
	if(j==string) {
		temp++;
		j=0;
	}
}
}

		return temp;
	}

	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		return null;
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		return null;
	}

	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		return 0;
	}

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}

	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		return true;
	}

}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}
