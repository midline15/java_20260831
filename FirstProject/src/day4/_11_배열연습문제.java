package day4;

public class _11_배열연습문제 {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 2, 4, 1 };

		ArrayFunction func = new ArrayFunction();

		func.arrayMax(arr); // "배열에서 가장 큰 값은 5 입니다." 출력

		int sum = func.arraySum(arr); // arr의 모든 수의 합 리턴
		System.out.println(sum);
		
		int num1 = func.arrayChoice(arr, 3); // 배열의 세번째 값을 리턴
		System.out.println(num1);
		
		func.arrayRandom(1); // 1~30사이의 랜덤한 숫자가 6개 담긴 배열 출력

	}
	
}