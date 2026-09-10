package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _7_과일가게 {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		System.out.println("====== 과일가게 프로그램 ======");

		while (true) {

			System.out.print("[ (1) 과일등록, (2) 가격수정,  (3) 과일검색, (그 외) 종료 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				// 과일 이름, 가격, 개수 입력받아서 map 에 저장 후
				// list 에 저장
				// 단, 동일한 이름의 과일이 이미 있으면
				// "이미 등록된 과일입니다." 출력 후 다시 메뉴로 이동

				HashMap<String, Object> map = new HashMap<>();

				System.out.print("이름 : ");
				String name = s.next();
				if (isDuplicate(list, name)) continue;
				map.put("name", name);

				System.out.print("가격 : ");
				int price = s.nextInt();
				map.put("price", price);

				System.out.print("갯수 : ");
				int amount = s.nextInt();
				map.put("amount", amount);
				list.add(map);
				System.out.println("===============================");
			} else if (menu == 2) {
				// 과일 이름 입력받아서 과일이 없으면 "해당 과일 없습니다" 출력
				// 있으면 가격 입력받아서 해당 가격으로 변경
				
				System.out.print("이름 : ");
//				String name = s.next();
				
				if(!isExistAndUpdatePrice(list, s.next())) continue;
				
				
				
			} else if (menu == 3) {
				// 과일 검색
			} else {
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}

	private static int findDuplicateIndex(ArrayList<HashMap<String, Object>> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).containsValue(name)) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean isDuplicate(ArrayList<HashMap<String, Object>> list, String name) {

		if(findDuplicateIndex(list, name) == -1) return false;

		System.out.println("이미 등록된 과일입니다.");
		return true;
	}
	
	private static boolean isExistAndUpdatePrice(ArrayList<HashMap<String, Object>> list, String name) {
		int index = findDuplicateIndex(list, name);
		if(index == -1) {
		System.out.println("해당 과일 없습니다.");
		return false;
		}
		updatePrice(list.get(index));
		return true;
	}
	
	private static void updatePrice(HashMap<String, Object> map) {
		System.out.println(map);
		System.out.println("가격 수정 : ");
		map.put("price", s.nextInt());
	}
}
