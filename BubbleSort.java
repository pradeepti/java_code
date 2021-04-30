//BubbleSort is the simplest sorting method with the worst case complexity of O(n^2).
//It works by repeatedly swapping the adjacent elements if they are in wrong order.

package java_code;

public class BubbleSort {

	public static void BubbleSorting(int[] arr) {
		int i, j, temp;
		for (i = 0; i < (arr.length - 1); i++) {
			for (j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 9, 78, 987, 5, 34, 0, 888 };
		BubbleSorting(arr);

		System.out.println("Sorted array");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
