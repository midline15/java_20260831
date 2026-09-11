package day10_ex;

import java.util.HashMap;
import java.util.Scanner;

public class MyFunction {
	static Scanner s = new Scanner(System.in);

	static String textLength(String msg, int length) {

		while (true) {

			System.out.print(msg);
			String input = s.next();
			if (input.length() == length) {
				return input;
			}
			System.out.println("글자수는 " + length + " 글자입니다. 다시 입력해주세요");
		}
	}

	static void insertScore(HashMap<String, Object> student, String subject, int min, int max) {
		while(true) {
			System.out.print(subject + "점수 : ");
			int score = s.nextInt();
			if(score >= min & score <= max) {
				student.put(subject, score);
				return;
			}
			System.out.println("숫자의 범위는 "+min+" ~ "+max+" 입니다.");

			
		}
	}

}
