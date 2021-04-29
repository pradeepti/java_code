package java_code;

public class Fibonacci {
	static int[] arr;

	static int Fibonacci_recur(int n) {
		arr = new int[n + 1];
		if (n == 0)
			arr[0] = 0;
		else {
			arr[0] = 0;
			arr[1] = 1;
		}

		return Fib(n);

	}

	private static int Fib(int n) {
		if (n == 0)
			return arr[0];
		if (n == 1)
			return arr[1];
		else {
			arr[n] = Fib(n - 1) + Fib(n - 2);
			// System.out.println("Series : " + arr[n]);
			return arr[n];
		}

	}

	private static void Iterative_recur(int n) {
		int prev1 = 0, prev2 = 1, temp;

		System.out.print(prev1 + "\t" + prev2 + "\t");

		for (int i = 0; i < n - 1; i++) {
			temp = prev1;
			prev1 = prev2;
			prev2 = temp + prev2;
			System.out.print(prev2 + "\t");
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci in recursive:");
		System.out.println(Fibonacci_recur(20));
		System.out.println("Fibonacci in iterative:");
		Iterative_recur(20);
	}
}
