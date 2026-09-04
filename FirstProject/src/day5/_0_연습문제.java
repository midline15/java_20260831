package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _0_연습문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
//		  1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
//		for (int i = 10; i <51; i++) {
//			if(i%6 == 0) System.out.println(i);

//		  2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
//		System.out.print("두 수 입력:");
//		if (s.nextInt() + s.nextInt() >10 ) System.out.println("큰 수");
//		else System.out.println("작은 수");

//		  3. 숫자를 하나 입력받고, 해당 숫자가 홀수인지 짝수인지 출력. 단, 숫자가 1~30사이 값이 아닐 경우 다시 입력하도록 함
//		int num =0;
//		for (;;) {
//			System.out.print("숫자 입력 : ");
//			num = s.nextInt();
//			if (num <31 && num > 0) {
//				break;
//			}
//
//		}
//		if (num % 2 == 0)
//			System.out.println("짝수");
//		else
//			System.out.println("홀수");

//		  4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 큰 수 인지 아닌지 판별하기 (ex, 랜덤
//		  수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 '랜덤 숫자가 더 큽니다' 출력, 두 수가 같으면
//		  '같습니다' 출력)
//		int rNum = r.nextInt(100) + 1;
//		System.out.println("랜덤 숫자 : " + rNum + " 숫자 입력 : ");
//		int num = s.nextInt();
//		if (num > rNum)
//			System.out.println("입력한 수가 더 큽니다");
//		else if (num == rNum)
//			System.out.println("같습니다");
//		else
//			System.out.println("랜덤 숫자가 더 큽니다");

//		  5. 2단부터 9단까지 구구단 출력 단, 짝수(2,4,6,8)단만 출력
//		for (int i = 1; i < 10; i++) {
//
//			for (int j = 2; j < 9; j += 2) {
//				System.out.print(j + " x " + i + " = " + j * i + "\t");
//			}
//			System.out.println();
//		}

//		  6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기 단, 0이하의 수를 입력하거나 중복된 숫자가
//		  있으면 안내 문구를 출력 후 다시 입력 받을 것 => 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
//		int arr[] = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println((i + 1) + "번째 숫자 : ");
//			int num = s.nextInt();
//			if (num < 1) {
//				i--;
//				continue;
//			}
//			arr[i] = num;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

//		  7. 6번에서 정의한 배열에서 홀수들의 합과 짝수들이 합의 차이 구하기
//		int eSum = 0;
//		int oSum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0)
//				eSum += arr[i];
//			else
//				oSum += arr[i];
//		}
//		System.out.println("홀수합 " + oSum + " - 짝수합 " + eSum + " = " + (oSum - eSum));

//		  8. 기본조건 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력
//		  시 안내 문구 후 다시 입력 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력 - 문제는 5문제
//		  고정. 5문제 모두 푼 후 맞춘 개수 출력 - 메인 메뉴에서 2번 선택 시 종료
//		while (true) {
//			System.out.print("1. 시작 2.종료 : ");
//			int menu = s.nextInt();
//			
//			if (menu == 2) {
//				break;
//			} else if (menu == 1) {
//				while(true) {
//					System.out.print("1. 2~5단 2. 6~9단 3. 12~19단 : ");
//					int lv = s.nextInt();
//					
//					if(lv<1 || lv>3) {
//						System.out.println("1~3 입력");
//						continue;
//					}
//					
//					System.out.println("===5문제 시작===");
//					int correct =0;
//					for(int i = 0; i < 5; i++) {
//						int x;
//						int y = r.nextInt(9)+1;
//						if(lv == 1) {
//							x = r.nextInt(4) +2;
//						}
//						else if(lv ==2 ) {
//							x = r.nextInt(4) + 6;
//						}
//						else {
//							x = r.nextInt(8) +12;
//						}
//						System.out.print((i+1)+"번 " +x+ " x " +y+" = ");
//						int answer = s.nextInt();
//						if(answer == x*y) {
//							System.out.println("정답입니다.");
//							correct++;
//						}else {
//							System.out.println("오답입니다.");
//						}
//					}
//					System.out.println(correct+ "문제 맞춤");
//					break;
//				}
//			}
//
//		}

	}

}
