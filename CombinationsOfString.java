package java_code;

public class CombinationsOfString {

	// @SuppressWarnings("resource")
	public static void main(String[] args) {

		// Scanner scanin = new Scanner(System.in);
		// System.out.println("Enter the string to get the combinations possible: ");
		String str = "tested";
		Combination("", str);

	}

	public static void Combination(String prefix, String str) {
		int len = str.length();

		if (prefix.length() > 0)
			System.out.println(prefix);
		for (int i = 0; i < len; i++) {
			Combination(prefix + str.charAt(i), str.substring(i + 1, len));
		}
	}
}
