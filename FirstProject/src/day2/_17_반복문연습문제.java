package day2;

public class _17_반복문연습문제 {

	public static void main(String[] args) {

		// 반복문을 활용해서 1부터 100까지 합한 수 구하기
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
