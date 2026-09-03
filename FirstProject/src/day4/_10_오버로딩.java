package day4;

public class _10_오버로딩 {

	static int sum(int x, int y) {
		return x + y;
	}

	static int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	static double sum(double x, int y) {
		return x + y;
	}

	public static void main(String[] args) {

		// 매개변수(인자, 파라미터) 갯수나 타입이 달라야 한다.
		// 1. 2개를 받아서 더해서 리턴 해주기
		int result1 = sum(3, 5);
	    double result3 = sum(3.4, 5);

		// 2. 정수 3개를 받아서 더해서 리턴 해주기
		int result2 = sum(3, 4, 5);

	}

}
