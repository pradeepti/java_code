package java_code;

public class FactorialOfNumber {
	public static void main(String[] args) {
		System.out.println("Factorial of number!");
		int num = 5;
		int result = Factorial(num);
		System.out.println(result);
	}

	public static int Factorial(int num) {
		if (num == 1)
			return 1;
		else {
			return (num * Factorial(num - 1));
		}
	}
}
