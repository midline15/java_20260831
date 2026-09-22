package day17;

import java.util.Random;
import java.util.Scanner;

public class 무한루프 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String[] rsp = { "가위", "바위", "보" };

		while (true) {
			int win = 0;
			int lose = 0;
			int draw = 0;
			int cnt;

			while (true) {
				System.out.print("[ 몇승? ] : ");
				cnt = s.nextInt();

				if (cnt > 0) {
					break;
				}

				System.out.println("1 이상의 숫자를 입력하세요.");
			}

			while (win < cnt && lose < cnt) {

				System.out.print("가위(1) 바위(2) 보(3) : ");
				int user = s.nextInt();
				if (user < 1 || user > 3) {
					System.out.println("다시 입력");
					continue;
				}
				int com = r.nextInt(3) + 1;
				System.out.println("컴퓨터 : " + rsp[com - 1] + "\t 나 : " + rsp[user - 1]);
				if (user == com) {
					System.out.println("비김");
					draw++;
				} else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
					System.out.println("이김");
					win++;
				} else {
					System.out.println("짐");
					lose++;
				}

			}

			System.out.println(win + "승 " + draw + "무 " + lose + "패");

			while (true) {

				System.out.print("한판더?(y or n) ");
				String menu = s.next().toLowerCase();

				if (menu.equals("y")) {

					break;

				} else if (menu.equals("n")) {

					System.out.println("종료");
					s.close();
					return;

				} else {

					System.out.println("다시 입력");
				}
			}
		}

	}

}
