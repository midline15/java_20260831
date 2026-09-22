package day17_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("=== 학생 관리 시스템 입니다! ===");

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("[ (1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료 ] ");
			int menu = s.nextInt();
			if (menu == 1) {
				System.out.print("이름 입력 : ");
				String name = s.next();
				int flag = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).containsValue(name)) {
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					HashMap<String, Object> map = new HashMap<>();
					map.put("name", name);
					list.add(map);
					System.out.println("학생이 추가되었습니다!");
				}
			} else if (menu == 2) {
				System.out.print("이름 입력 : ");
				String name = s.next();
				int flag = 0;
				HashMap<String, Object> map;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).containsValue(name)) {
						flag = 1;
						map = list.get(i);
						while (true) {
							System.out.print("java: ");
							int java = s.nextInt();
							if (java < 0 || java > 100) {
								System.out.println("0~100 값을 입력해주세요.");
							} else {
								map.put("java", java);
								break;
							}
						}
						while (true) {
							System.out.print("oracle: ");
							int oracle = s.nextInt();
							if (oracle < 0 || oracle > 100) {
								System.out.println("0~100 값을 입력해주세요.");
							} else {
								map.put("oracle", oracle);
								break;
							}
						}

						break;
					}
				}
				if (flag == 0) {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}

			} else if (menu == 3) {
				System.out.println(list);
			} else if (menu == 4) {
				System.out.print("이름 입력 : ");
				String name = s.next();
				int flag = 0;
				int stuIndex = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).containsValue(name)) {
						flag = 1;
						stuIndex = i;
					}
				}
				if (flag == 0) {
					System.out.println("해당 학생이 존재하지 않습니다.");
				} else {
					HashMap<String, Object> map = list.get(stuIndex);
					System.out.print("수정할 과목명(java, oracle) : ");
					String subject = s.next();
					if (!map.containsKey(subject)) {
						System.out.println("없는 과목입니다. 메뉴로 이동합니다.");
					} else {
						while (true) {
							System.out.print(subject + ": ");
							int score = s.nextInt();
							if (score < 0 || score > 100) {
								System.out.println("0~100 값을 입력해주세요.");
							} else {
								map.put(subject, score);
								break;
							}
						}
					}
				}

			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
