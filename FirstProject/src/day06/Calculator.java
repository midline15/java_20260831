package day06;

public class Calculator {

	public static int sum(int i, int j) {
		return i + j;
	}

	public static int sum(int i, int j, int k) {
		return i + j + k;
	}

	public static double sum(double d, double e) {
		return d + e;
	}

	public static void multiple(int i, int j) {
		System.out.println("두 수의 곱은 " + i * j + " 입니다");
	}

	public static void arraySum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("배열의 모든 수의 합은 " + sum + " 입니다");
	}

}
