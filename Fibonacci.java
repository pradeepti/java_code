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

	private static int Iterative_recur(int n) {
		int fib_sum = 0;
		if (n == 0)
			return n;
		if (n == 1)
			return n;
		else {
			while (n >= 0) {
				fib_sum = fib_sum + n;
				n--;

			}
			return fib_sum;
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci in recursive:");
		System.out.println(Fibonacci_recur(20));
		System.out.println("Fibonacci in iterative:");
		System.out.println(Fibonacci_recur(20));
	}
}
