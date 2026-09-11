package day07_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	static Scanner s = new Scanner(System.in);
	static Random ran = new Random();

	public static void main(String[] args) {
		while (true) {
			System.out.print("[ 문제 번호 입력(1~10) - 0입력 시 종료 ] : ");
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
			case 5:
				question5();
				break;
			case 6:
				question6();
				break;
			case 7:
				question7();
				break;
			case 8:
				question8();
				break;
			case 9:
				question9();
				break;
			case 10:
				question10();
				break;
			default:
				System.out.println("문제 번호 오류!");
				break;
			}

		}
	}

	private static void question1() {
		System.out.println("\r\n1. 아래 조건에 맞게 변수 선언 및 초기화 하고 변수를 이용하여 결과를 출력하세요.\r\n"
				+ "	- 변수명 : name 	 , 값 : 홍길동\r\n" + "	- 변수명 : age  	 , 값 : 30\r\n"
				+ "	- 변수명 : addr 	 , 값 : 인천\r\n" + "출력 결과 : '홍길동의 나이는 30, 주소는 인천 입니다.'");

		String name = "홍길동";
		int age = 30;
		String addr = "인천";

		System.out.println(name + "의 나이는 " + age + ", 주소는 " + addr + " 입니다");
	}

	private static void question2() {
		System.out.println("\r\n2. 스캐너를 통해 숫자를 입력받은 후 \r\n" + "홀수일 경우 \"홀수\", 짝수일 경우 \"짝수\"를 출력하세요.\r\n"
				+ "단, 0이하의 숫자나 11이상의 숫자일 경우 \"계산할 수 없습니다.\" 를 출력하시오.");

		while (true) {
			System.out.print("0에서 10사이 숫자 입력 : ");
			int inputNum = s.nextInt();
			if (inputNum <= 0 || inputNum >= 11) {
				System.out.println("계산할 수 없습니다.");
				continue;
			} else {
				System.out.println(inputNum % 2 == 0 ? "짝수" : "홀수");
				break;
			}
		}
	}

	private static void question3() {
		System.out.println(
				"\r\n3. 2이상 9이하의 숫자를 입력받은 후 해당 숫자의 구구단을 출력하세요.\r\n" + "2~9사이 숫자가 아닐경우 '잘못 입력된 숫자 입니다'를 출력 후 종료해주세요.");

		System.out.print("2이상 9이하 숫자 입력 : ");
		int inputNum = s.nextInt();
		if (inputNum < 2 || inputNum > 9) {
			System.out.println("잘못 입력된 숫자 입니다");
			return;
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(inputNum + " x " + i + " = " + inputNum * i);
		}
	}

	private static void question4() {
		System.out.println("\r\n4. 1에서 50 사이의 숫자를 하나 입력받습니다.\r\n" + "만약 사용자가 1~50 범위를 벗어난 숫자를 입력하면,\r\n"
				+ "올바른 범위의 숫자를 입력할 때까지 계속해서 다시 입력받도록 안내문을 띄웁니다. \r\n" + "올바른 숫자가 입력되면 종료합니다.");

		while (true) {
			System.out.print("1에서 50 사이의 숫자 입력 : ");
			int inputNum = s.nextInt();
			if (inputNum < 1 || inputNum > 50) {
				System.out.println("올바른 범위의 숫자를 다시 입력하세요");
			} else {
				System.out.println("올바른 범위의 숫자를 입력했습니다.");
				break;
			}
		}
	}

	private static void question5() {
		System.out.println("\r\n5. 사용자로부터 세 과목(국어, 영어, 수학)의 점수를 각각 입력받아 평균을 구하세요.\r\n"
				+ "평균이 80점 이상이면 '합격', 그렇지 않으면 '불합격'을 출력합니다. \r\n"
				+ "단, 세 과목 중 단 한 과목이라도 50점 미만이 있다면 평균 점수와 상관없이 '과락으로 인한 불합격'을 출력해야 합니다.");

		System.out.print("국어 점수 : ");
		int kor = s.nextInt();
		System.out.print("영어 점수 : ");
		int eng = s.nextInt();
		System.out.print("수학 점수 : ");
		int math = s.nextInt();
		if (kor < 50 || eng < 50 || math < 50) {
			System.out.println("과락으로 인한 불합격");
			return;
		}
		double avr = (kor + eng + math) / 3.0;
		System.out.println("평균점수 : " + avr);
		System.out.println(avr >= 80 ? "합격" : "불합격");

	}

	private static void question6() {
		System.out.println("\r\n6. 크기가 10인 정수형 배열을 생성하고, \r\n" + "반복문을 사용하여 1부터 100 사이의 랜덤한 값으로 배열을 가득 채우세요.\r\n"
				+ "단, 마지막 숫자가 3으로 끝나는 숫자는 넣으면 안됩니다.(예 => 3, 13, 23 .. 93).\r\n"
				+ "최종 결과를 Arrays.toString() 메소드를 통해 출력해주세요.");

		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			if (arr[i] % 10 == 3) {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void question7() {
		System.out.println(
				"\r\n7. 크기가 5인 정수형 배열을 선언하고 사용자로부터 숫자를 5개 입력받아 저장하세요.\r\n" + "그 후, 사용자에게 '검색할 숫자'를 하나 더 입력받습니다. \r\n"
						+ "검색한 숫자가 배열에 존재한다면 \"해당 숫자는 배열의 O번째에 있습니다.\" (인덱스 출력)라고 안내하고, \r\n"
						+ "존재하지 않는다면 \"배열에 없는 숫자입니다.\"라고 출력하세요.");

		int arr[] = new int[5];

		System.out.println("정수 5개 입력 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("검색할 숫자 : ");
		int findNum = s.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (findNum == arr[i]) {
				System.out.println("해당 숫자는 배열의 " + i + "번째에 있습니다.");
				break;
			}
			if (i == 4) {
				System.out.println("배열에 없는 숫자입니다.");
			}
		}
	}

	private static void question8() {
		System.out.println("\r\n8. 크기가 20인 int형 배열을 생성하고, 1부터 5 사이의 랜덤한 숫자로 배열을 가득 채우세요.\r\n"
				+ "그 다음, 배열 안에 1, 2, 3, 4, 5가 각각 몇 번씩 등장(생성)했는지 개수를 세어서 출력하세요.\r\n"
				+ "(출력 예시 => 1: 3번, 2: 1번, 3: 4번, 4: 0번, 5: 2번)");

		int arr[] = new int[20];
		int count[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(5) + 1;
			for (int j = 1; j < 6; j++) {
				if (arr[i] == j) {
					count[j - 1]++;
					break;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (i == count.length - 1) {
				System.out.println((i + 1) + ": " + count[i] + "번");
			} else {
				System.out.print((i + 1) + ": " + count[i] + "번, ");
			}
		}

	}

	private static void question9() {
		System.out.println("\r\n9. 홀짝 맞추기 게임을 만들어주세요. 랜덤으로 생성되는 숫자의 범위는 1~100 사이 값 입니다.\r\n"
				+ "1번 메뉴로 들어가면 5문제를 출제하며, 선택한 답변에 따라 정답 및 오답을 출력합니다.\r\n"
				+ "2번 메뉴를 선택하면 종료되며, 그 외의 값을 입력하면 다시 입력하도록 유도합니다.\r\n" + "자세한 내용을 아래 이미지를 참고해주세요.");

		while (true) {
			System.out.print("[1. 홀짝 게임 시작, 2. 종료] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				int correct = 0;
				System.out.println("====== 홀짝 맞추기 게임을 시작합니다(5라운드) ======");
				for (int i = 1; i < 6; i++) {
					int comNum = ran.nextInt(100) + 1;
					System.out.print("[" + i + "] 컴퓨터가 숫자를 뽑았습니다! [1. 홀수, 2. 짝수] : ");
					int answer = s.nextInt();
					if ((comNum % 2 == 0 && answer == 2) || (comNum % 2 == 1 && answer == 1)) {
						System.out.println("정답입니다! (컴퓨터가 뽑은 숫자 :" + comNum + ")");

						correct++;
					} else {
						System.out.println("틀렸습니다! (컴퓨터가 뽑은 숫자 :" + comNum + ")");
					}
				}
				System.out.println("총 5문제 중 " + correct + "개 맞추셨습니다.");
			} else if (menu == 2) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("메뉴는 1~2중에 선택해주세요.");
			}
		}
	}

	private static void question10() {
		System.out.println("\r\n10. 배열 int arr[] = {7, 4, 5, 1, 3} 를 선언하고 '버블 정렬'을 통해 오름차순 하세요.\r\n"
				+ "'버블 정렬'은 아래 이미지 및 설명을 통해 이해한 후 코드로 작성해주세요.\r\n"
				+ "해당 문제는 검색을 하지 말고 풀이해보시기 바랍니다. (기존 코드는 참고하셔도 됩니다.)");

		int arr[] = { 7, 4, 5, 1, 3 };
		System.out.println("정렬 전 : " + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}
