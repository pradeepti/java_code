package java_code;

public class SubArray {

	// O(N) solution without using the stack.

	public static int[] countSubarrays(int[] arr) {
		int[] result = new int[arr.length];
		if (arr.length == 0)
			return result;

		int[] l = new int[arr.length];
		int[] r = new int[arr.length];

		int leftMaxIndex = 0;
		l[0] = 1;
		// Start traversing from left and track index of the maxSoFar
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				if (arr[i] > arr[leftMaxIndex]) {
					// if element at i is greater than maxSoFar, subarrays at i = subarrays at
					// maxSoFar + diff between indices (since there will be few more from older
					// maxSoFar to i)
					l[i] = l[leftMaxIndex] + (i - leftMaxIndex);
					leftMaxIndex = i;
				} else {
					// if element at i is less than maxSoFar, subarrays at i = subarrays at i-1 + 1
					// (self)
					l[i] = l[i - 1] + 1;
				}
			} else {
				// no new subarrays except for self when element at i is less than the element
				// at i-1
				l[i] = 1;
			}
		}

		// do the same from right
		int rightMaxIndex = arr.length - 1;
		r[arr.length - 1] = 1;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > arr[rightMaxIndex]) {
					r[i] = r[rightMaxIndex] + (rightMaxIndex - i);
					rightMaxIndex = i;
				} else {
					r[i] = r[i + 1] + 1;
				}
			} else {
				r[i] = 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			result[i] = l[i] + r[i] - 1; // counting self twice so remove 1
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 21, 2, 4 };
		int result[] = countSubarrays(arr);
	}

}
