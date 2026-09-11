package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _4_복습문제 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		ArrayList<String> nameList = new ArrayList<String>();

		System.out.println("====== 과일가게 ======");

		while (true) {
			System.out.print("[ (1) 추가  (2) 가격수정  (3) 가격수정v2  (그 외) 종료 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				// 과일 이름, 가격을 입력받아서 map에 저장 후
				// 해당 map 을 리스트에 저장
				HashMap<String, Object> map = new HashMap<>();

				System.out.print("과일 이름 : ");
				String name = s.next();
				map.put("name", name);

				System.out.print("가격 : ");
				int price = s.nextInt();
				map.put("price", price);

				list.add(map);
				nameList.add(name);
				System.out.println(list);
			} else if (menu == 2) {
				// 과일 이름 입력 받은 후 해당 과일 있으면
				// 가격 입력받아서 수정
				// 없으면 "해당 과일은 없습니다." 출력 후 메뉴로
				while (true) {
					HashMap<String, Object> map = findByName(list);
					if (map.isEmpty()) break;
					
					updatePrice(map);
					
					System.out.println(list);
					break;
				}
			} else if(menu == 3) {
				System.out.print("과일 이름 : ");
				String name = s.next();
				if(nameList.contains(name)) {
					int index = nameList.indexOf(name);
					HashMap<String, Object> fruit = list.get(index);
					System.out.print( "수정할 가격 : ");
					int price = s.nextInt();
					fruit.put("price", price);
				}else {
					System.out.println("해당 과일 없습니다.");
				}
			}

		}

	}

	private static void updatePrice(HashMap<String, Object> map) {
		System.out.println("수정할 가격 : ");
		int price = s.nextInt();
		map.put("price", price);
	}

	static HashMap<String, Object> findByName(ArrayList<HashMap<String, Object>> list) {
		System.out.print("과일 이름 : ");
		String name = s.next();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).containsValue(name))
				return list.get(i);
		}
		System.out.println("해당 과일이 없습니다.");
		return null;
	}

}
