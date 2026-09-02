package dya3;

import java.util.Random;
import java.util.Scanner;

public class _9_랜덤구구단 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("랜덤 구구단 프로그램을 실행합니다.");
		System.out.println("0을 입력하면 종료합니다.");
		
		int question = 0, correctCount = 0;
		
		for(;;) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			
			System.out.print(x + " x " + y + " = ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println(question + "문제 중 " + correctCount + "문제를 맞췄습니다.");
				System.out.println("종료되었습니다.");
				break;
			}
			
			else if (x*y == answer) {
				System.out.println("정답");
				correctCount++;
			}else {
				System.out.println("오답");
			}
			
			question++;
		}
		
	}

}
