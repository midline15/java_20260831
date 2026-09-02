package dya3;

import java.util.Random;
import java.util.Scanner;

public class _10_Up_Down {

	public static void main(String[] args) {

		// 1~100 사이에 랜덤한 숫자가 생성되고, 해당 숫자를 맞추는 게임
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int answer = ran.nextInt(100)+1;
		int count = 0;
		
		System.out.println("업다운 게임(0:종료)");
		
		for(;;) {
			
			count++;
			
			System.out.print(count + "번째 시도 : ");
			int num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			
			if(num <0 || num > 100) {
				System.out.println("1~100사이 수를 입력해주세요");
				count--;
				continue;
			}
			
			if(num == answer) {
				System.out.println("정답");
				break;
			} else if(num < answer) {
				System.out.println("Up");
			} else {
				System.out.println("Down");
			}
			
		}
		
	}

}
