package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _6_JSON문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		System.out.println("====== 성적 입력 프로그램 ======");

		while (true) {
			System.out.print("[ (1) 성적입력, (2) 성적확인, (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 이름, 자바점수, db점수, html점수 입력 받아서 map으로 만든후
				// list 에 저장

					HashMap<String, Object> map = new HashMap<>();
					
					System.out.print("이름 : ");
					String name = s.next();
					if(isDuplicate(list, name)) {
						System.out.println("이미 존재하는 이름입니다.");
						continue;
					}
					map.put("name", name);
					
					System.out.print("java 점수 : ");
					int java = s.nextInt();
					map.put("java", java);
					
					System.out.print("db 점수 : ");
					int db = s.nextInt();
					map.put("db", db);

					System.out.print("html 점수 : ");
					int html = s.nextInt();
					map.put("html", html);
					list.add(map);
					System.out.println("===============================");
				
			} else if (menu == 2) {
				// 이름을 입력받은 후 해당 학생의 자바점수, db점수, html점수 출력
				// 해당 학생이 list에 존재하지 않으면 "등록된 학생이 아닙니다." 출력
				System.out.print("이름을 입력하세요 : ");
				String name = s.next();
				boolean checkName = false;

				for(int i = 0; i< list.size(); i++) {
					HashMap<String, Object> map2 = list.get(i);
					
					if(map2.containsValue(name)) {
//						System.out.println(map2);
						System.out.print("자바 : "+ map2.get("java"));
						System.out.print(", db : "+ map2.get("db"));
						System.out.println(", html : "+ map2.get("html"));
						
						checkName = true;
//						break;
					}
				}
				if(!checkName) System.out.println("등록된 학생이 아닙니다.");
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}
	
	static boolean isDuplicate(ArrayList<HashMap<String, Object>> list, String name) {
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).containsValue(name)) return true;
		}
		
		return false;
	}

}
