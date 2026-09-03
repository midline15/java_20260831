package day3;

import java.util.Random;
import java.util.Scanner;

public class _11_Up_Down복습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int answer = ran.nextInt(100)+1;
		int count = 1;
		
		System.out.println("업다운 게임(0:종료)");
		
		for(;;) {
			
			
			System.out.print(count + "번째 시도 : ");
			int num = scan.nextInt();
			
			
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			
			if(num>100 || num <0) {
				System.out.println("1~100사이 수를 입력하세요");
				continue;
			}
			
			if(num> answer) {
				System.out.println("Down");
			}else if(num<answer){
				System.out.println("Up");
			}else {
				System.out.println("정답");
				break;
			}
			count++;
			
			
		}
	}

}
