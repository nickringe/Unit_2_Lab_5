
public class extendedChallenge {

	public static void capitalize(String word) {
		String capitalWord = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
		System.out.println("The word '" + word + "' becomes: " + capitalWord);
		
	}

	public static void wheresWaldo(String phrase) {
		int waldoNumber = phrase.indexOf("Waldo");
		System.out.println("In the phrase '" + phrase + "' the string Waldo is at the index of " + waldoNumber);
	}

	public static void firstThingsFirst(String a, String b) {
		int compare = a.compareTo(b);
		if (compare > 0) {
			System.out.println("The correct alphabetical order in this case is: " + b + a);
		} else if (compare < 0) {
			System.out.println("The correct alphabetical order in this case is: " + a + b);
		} else {

			System.out.println("The strings are equal!");
		}
	}

	public static void reverse(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println("The word " + s + " becomes: " + reverse);

	}

	public static void soLong(String a, String b) {
		int one = a.length();
		int two = b.length();
		if (one > two) {
			System.out.println("The longer of these two words is: " + a);
		} else if (two > one) {
			System.out.println("The longer of these two words is: " + b);
		} else {
			System.out.println(a + " and " + b + " are the same length!");

		}
	}
	
	public static void afterMath(String phrase) {
		int mathIndex = phrase.indexOf("math");
		if (mathIndex > -1) {
			System.out.println(phrase.substring(mathIndex));
		} else {
			System.out.println("Dud");
		}
	}
	
	public static void letterize (String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

}
