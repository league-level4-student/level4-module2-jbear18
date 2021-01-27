package StringMethods;

public class SpinWords {
	public static String spinWords(String original) {
		String sentence = "";
		if (original.contains(" ")) {
			String[] words = original.split(" ");
			for (int i = 0; i < words.length; i++) {
				sentence += reverseString(words[i]) + " ";
			}
		} else {
			sentence += reverseString(original);
		}
		return sentence.trim();

	}

	static String reverseString(String s) {
		String str = "";
		for (int j = s.length(); j > 0; j--) {
			str += s.substring(j - 1, j);

		}
		return str;
	}
}
