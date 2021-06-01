package java_code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RotLeft {

	/*
	 * Complete the 'rotLeft' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER d
	 */

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		// Write your code here
		// List<Integer> newList = new ArrayList<Integer>();
		if (d == 0 || a.size() == 0)
			return a;
		int rotation = d % a.size();

		if (rotation == 0)
			return a;
		// int item;
		for (int i = 0; i < rotation; i++) {
			a.add(a.get(0));
			a.remove(0);
			// System.out.println(a);
		}
		return a;

	}

	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		// String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$",
		// "").split(" ");

//		int n = Integer.parseInt(firstMultipleInput[0]);
//
//		int d = Integer.parseInt(firstMultipleInput[1]);

		int n = 6;
		int d = 4;

//		String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		String[] aTemp = new String[] { "1", "4", "5", "6", "7", "8" };
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aTemp[i]);
			a.add(aItem);
		}
		System.out.print("Original array: ");
		System.out.println(a);

		List<Integer> result = rotLeft(a, d);

		for (int i = 0; i < result.size(); i++) {
			System.out.print(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				System.out.print(" ");
			}
		}

//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
	}
}
