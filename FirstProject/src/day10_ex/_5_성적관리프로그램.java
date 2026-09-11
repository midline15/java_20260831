package day10_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _5_성적관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<String, HashMap<String, Object>> map = new HashMap<>();

		System.out.println("======= 성적관리 프로그램 ======");
		while (true) {
			System.out.print("[ (1) 성적등록  (2) 성적확인  (3) 성적순위  (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 1. 학번은 무조건 4글자, 4글자 벗어나면 다시 입력
				// 2. 중복된 학번이면 다시 입력
				// 3. 각 과목의 점수를 입력받을 때 점수의 범위는
				// 자바 : 0~40, db : 0~35, html : 0~25
				// 해당 범위외의 숫자 입력 시 다시 입력하도록

				HashMap<String, Object> student = new HashMap<>();
				String stuNo;
				while (true) {
					stuNo = MyFunction.textLength("학번 : ", 4);
					if (map.containsKey(stuNo)) {
						System.out.println("중복된 번호입니다.");
						continue;
					}
					map.put(stuNo, student);
					break;
				}

				System.out.print("이름 : ");
				String name = s.next();
				student.put("name", name);

				MyFunction.insertScore(student, "java", 0, 40);
				MyFunction.insertScore(student, "db", 0, 35);
				MyFunction.insertScore(student, "html", 0, 25);

				System.out.println(student);
				System.out.println(map);
			} else if (menu == 2) {
				// 학번을 입력받아서 해당 학번이 존재하면
				// 해당 학생의 시험 총점을 출력
				// 해당 학번 없으면 "학번을 확인해주세요" 출력 후 메뉴로 이동.

				String stuNo = MyFunction.textLength("학번 : ", 4);
				if (stuNo.isEmpty()) {
					System.out.println("학번을 확인해주세요");
				} else {
					int total = (int) map.get(stuNo).get("java") + (int) map.get(stuNo).get("db")
							+ (int) map.get(stuNo).get("html");
					System.out.println("총점 : " + total + "점");
				}
			} else if (menu == 3) {
				// 메뉴에 들어오면 학생들 전체 등수 출력
				// 5명 있으면
				// 1등 : 000 , 00점(총점)
				// 2등 : 000, 00점(총점)
				// ...
				// 5등 : 000, 00점(총점)
				
//				for(int i = 0; i<5; i++) {
//					HashMap<String, Object> student = new HashMap();
//					student.put("name", "학생"+i);
//					student.put("java", i+1);
//					student.put("db", i*2);
//					student.put("html", 20-i);
//					map.put("000"+i, student);
//				}
				
				
				int[] totalArr = new int[map.size()];
				String[] name = new String[map.size()];

				Iterator<String> it = map.keySet().iterator();
				int i = 0;
				while (it.hasNext()) {
					String stuNo = it.next();
					int total = (int) map.get(stuNo).get("java") + (int) map.get(stuNo).get("db")
							+ (int) map.get(stuNo).get("html");
					totalArr[i] = total;
					name[i] = map.get(stuNo).get("name").toString();
					i++;
				}

				for (int j = 0; j < totalArr.length - 1; j++) {
					for (int k = 1; k < totalArr.length; k++) {
						if (totalArr[k] < totalArr[k - 1]) {
							int tmp = totalArr[k - 1];
							totalArr[k - 1] = totalArr[k];
							totalArr[k] = tmp;

							String temp = name[k - 1];
							name[k - 1] = name[k];
							name[k] = temp;
						}
					}
				}
				// 5등 : 000, 00점(총점)
				for (int j = 1; j <= totalArr.length; j++) {
					System.out.println(j + "등 : " + name[totalArr.length - j] + ", " + totalArr[totalArr.length - j] + "점");
				}

			} else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}