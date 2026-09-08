package day7;

import java.util.Random;
import java.util.Scanner;

public class Example {
	static Scanner s = new Scanner(System.in);
	static Random ran = new Random();

	public static void main(String[] args) {
		while (true) {
			System.out.print("[ 문제 번호 입력(1~4) - 0입력 시 종료 ] : ");
			int menu = s.nextInt();

			if (menu == 0) {
				System.out.println("종료 됨");
				break;
			}

			switch (menu) {
			case 1:
				question1();
				break;
			case 2:
				question2();
				break;
			case 3:
				question3();
				break;
			case 4:
				question4();
				break;
			default:
				System.out.println("문제 번호 오류!");
				break;
			}

		}
	}

	private static void question4() {
		System.out.println("Random 클래스를 활용하여 컴퓨터와 사용자의 '주사위 게임'을 만드세요.\r\n"
				+ "컴퓨터와 사용자가 각각 주사위(1~6 사이의 랜덤한 수)를 3번씩 던집니다(반복문 활용).\r\n"
				+ "3번 던져서 나온 눈의 총합을 각각 구한 뒤, 총합이 더 큰 쪽이 승리합니다. \r\n"
				+ "최종적으로 \"컴퓨터 총합: O점, 사용자 총합: O점\"을 출력하고 \r\n"
				+ "승자(컴퓨터 승리 / 사용자 승리 / 무승부)를 출력하세요.");
		int mySum = 0;
		int comSum = 0;
		for (int i = 0; i < 3; i++) {
			mySum += ran.nextInt(6) + 1;
			comSum += ran.nextInt(6) + 1;
		}
		System.out.println("컴퓨터 총합: " + comSum + "점, 사용자 총합: " + mySum + "점");
		if (comSum > mySum) {
			System.out.println("컴퓨터 승리");
		} else if (comSum < mySum) {
			System.out.println("사용자 승리");
		} else {
			System.out.println("무승부");
		}
	}

	private static void question3() {
		System.out.println("크기가 5인 정수형 배열을 선언하고 사용자로부터 5개의 숫자를 입력받아 저장하세요.\n"
				+ "그 후, 배열에 저장된 숫자들을 입력받은 순서의 반대(역순)로 화면에 출력하세요.\n"
				+ "( Arrays.sort() 필요하다면 사용해도되고 안해도 되고.. )\r\n"
				+ "(예: 10, 20, 30, 40, 50 순으로 입력했다면 50, 40, 30, 20, 10 순으로 출력되어야 합니다.)");
		int[] arr = new int[5];
		for (int i=0;i< arr.length; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 4; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void question2() {
		System.out.println("2. 크기가 5인 정수형 배열을 만들고 1부터 100사이의 랜덤한 숫자 5개를 넣습니다.\r\n"
				+ "이후 배열의 숫자들 중에서 '홀수'만 찾아내어 출력하고, \r\n"
				+ "마지막에 홀수가 총 몇 개 입력되었는지 카운트하여 출력하세요.");
		int[] arr = new int[5];
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			if (arr[i] % 2 == 1) {
				System.out.println(arr[i]);
				oddCount++;
			}
		}
		System.out.println("홀수는 총 " + oddCount + "개");
	}

	private static void question1() {
		System.out.println("1. 1부터 100까지의 숫자 중 5의 배수이지만 8의 배수는 아닌 숫자들만 화면에 출력하고, \r\n"
				+ "마지막에 그 숫자들의 총 개수를 출력하세요.");
		int count = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 5 == 0 && i % 8 != 0) {
				System.out.print(i+"\t");
				count++;
			}
			if(i % 50 == 0) {
				System.out.println();
			}
		}
		System.out.println("총 : " + count + "개");
	}

}
