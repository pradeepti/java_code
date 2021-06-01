package java_code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'isBalanced' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String isBalanced(String s) {
		// Write your code here
		int sz = s.length();
		if (sz % 2 == 1)
			return "NO";
		LinkedList<Character> stack = new LinkedList<Character>();
		System.out.println("String : " + s);
		for (char c : s.toCharArray()) {
			if (c == '{' || c == '[' || c == '(')
				stack.push(c);
			else {
				if (stack.isEmpty())
					return "NO";
				if (matchBracket(stack.pop()) != c)
					return "NO";
			}
		}
		return "YES";
	}

	private static char matchBracket(Character c) {
		switch (c) {
		case '{':
			return '}';
		case '[':
			return ']';
		case '(':
			return ')';
		default:
			return '@';
		}
	}

}

public class BalanceBracket {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String s = bufferedReader.readLine();

				String result = Result.isBalanced(s);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
