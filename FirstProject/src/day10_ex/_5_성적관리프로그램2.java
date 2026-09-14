package day10_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _5_성적관리프로그램2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<String, HashMap<String, Object>> map = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			HashMap<String, Object> student = new HashMap();
			student.put("name", "학생" + i);
			student.put("java", i + 1);
			student.put("db", i * 2);
			student.put("html", 20 - i);
			map.put("000" + i, student);
		}

		System.out.println("======= 성적관리 프로그램 ======");
		while (true) {
			System.out.print("[ (1) 성적등록  (2) 성적확인  (3) 성적순위  (4) 성적수정  (5) 삭제 (그 외) 종료 ] : ");
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

				Iterator<String> it = map.keySet().iterator();
				ArrayList<HashMap<String, Object>> rankList = new ArrayList<HashMap<String, Object>>();

/// 해결완료!!!!!!!!!!!!!!!!!!!!!!
				while (it.hasNext()) {
					String stuNo = it.next();
					int total = (int) map.get(stuNo).get("java") + (int) map.get(stuNo).get("db")
							+ (int) map.get(stuNo).get("html");

					HashMap<String, Object> student = new HashMap();
					student.put("total", total);
					student.put("name", map.get(stuNo).get("name").toString());
					rankList.add(student);
				}

				for (int i = 1; i < rankList.size(); i++) {
					for (int j = 0; j < rankList.size() - i; j++) {
						if ((int) rankList.get(j).get("total") < (int) rankList.get(j + 1).get("total")) {
							Collections.swap(rankList, j, j + 1);

						}
					}
				}

				// 5등 : 000, 00점(총점)
				for (int i = 0; i < rankList.size(); i++) {
					System.out.println(
							(i + 1) + "등 : " + rankList.get(i).get("name") + ", " + rankList.get(i).get("total") + "점");
				}

			} else if (menu == 4) {
				// 학번을 입력받아서 해당 학생이 없으면 "학번을 확인해주세요" 출력후 메뉴로이동
				// 있는 학번이면 '자바', 'db', 'html' 점수를 다시 입력받아 해당 점수로 저장
				// 자바 db html 의 점수 범위는 1번 메뉴와 동일
				String stuNo = MyFunction.textLength("학번 : ", 4);
				if (map.containsKey(stuNo)) {
					HashMap<String, Object> student = map.get(stuNo);

					MyFunction.insertScore(student, "java", 0, 40);
					MyFunction.insertScore(student, "db", 0, 35);
					MyFunction.insertScore(student, "html", 0, 25);
				} else {
					System.out.println("학번을 확인해주세요");
				}

			} else if (menu == 5) {

				// 학번을 입력받아서 해당 학생이 없으면 "학번을 확인해주세요" 출력후 메뉴로이동
				// 있는 학번인 경우 '정말 삭제?' 물어보고
				// y(대소문자) 삭제 그 외 문자입력 취소되었습니다 출력 후 메뉴
				String stuNo = MyFunction.textLength("학번 : ", 4);
				if (map.containsKey(stuNo)) {
					System.out.print("정말 삭제?");
					if(s.next().toLowerCase().equals("y")) {
						map.remove(stuNo);
						System.out.println("삭제 되었습니다.");
					}else {
						System.out.println("취소되었습니다.");
					}
				}
				else {System.out.println("학번을 확인해주세요.");}
			} else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}