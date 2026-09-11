package day03;

import java.util.Random;
import java.util.Scanner;

public class _99_문제풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("=== 랜덤 구구단 ===");

		for (;;) {

			System.out.print("[ (1) 구구단 시작\t(2) 종료] : ");
			int menu = scan.nextInt();

			if (menu != 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			for (;;) {

				System.out.print("문제수를 입력해주세요(0:이전메뉴로) : ");
				int count = scan.nextInt();
				if (count == 0) {
					break;
				} else if (count < 0) {
					System.out.println("다시 입력해주세요.");
					continue;
				}

				int correct = 0;

				for (int i = 1; i <= count; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;

					System.out.print("[" + i + "번 문제] " + x + " * " + y + " = ");
					int answer = scan.nextInt();

					if (answer == x * y) {
						System.out.println("정답!!!");
						correct++;
					} else {
						System.out.println("오답!!!");
					}
				}
				System.out.println("총 " + correct + "문제 맞추셨습니다.\n");
				break;
			}

		}

	}

}
