package java_code;

public class FactorsOfNumber {
	public static void main(String[] args) {
		int num = 441, i = 1;
		while (i <= num / 2) {
			if (num % i == 0)
				System.out.print(i + "\t");
			i++;
		}
		System.out.print(num); // as number is a factor of itself too.
	}

}
