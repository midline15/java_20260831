package day3;

public class _4_반복문키워드 {

	public static void main(String[] args) {

		// break, continue
		/*
		 * // 3의 배수 이면서, 7의 배수인 숫자를 만나면 출력하고 종료 for(int i =1;;i++) { if(i % 3 == 0 && i
		 * % 7 ==0) { System.out.println(i); break; } }
		 */

		// 1부터 100까지 숫자중 3의 배수만 빼고 출력
		/*
		 * for(int i =1;i<=100;i++) { if(i % 3 != 0) { System.out.println(i); } }
		 */
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
