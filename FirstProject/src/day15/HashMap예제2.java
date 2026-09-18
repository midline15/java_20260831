package day15;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap예제2 {

	public static void main(String[] args) {
		// 스캐너로 학번, 이름, 자바점수, db점수 입력받아서
		// map에 저장
		// stuNo name java db
		Scanner s = new Scanner(System.in);
		HashMap<String, Object> hong = new HashMap<String, Object>();
		System.out.print("학번 : ");
		hong.put("stuNo", s.next());
		System.out.print("이름 : ");
		hong.put("name", s.next());
		System.out.print("자바점수 : ");
		hong.put("java", s.nextInt());
		System.out.print("db점수 : ");
		hong.put("db", s.nextInt());
		
		System.out.println(hong);
	}

}
