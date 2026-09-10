package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _8_과일가게 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		System.out.println("====== 과일가게 프로그램 ======");

		while (true) {

			System.out.print("[ (1) 과일등록, (2) 가격수정,  (3) 과일 구매, (4) 메뉴판, (그 외) 종료 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				// 과일 이름, 가격, 개수 입력받아서 map 에 저장 후
				// list 에 저장
				// 단, 동일한 이름의 과일이 이미 있으면
				// "이미 등록된 과일입니다." 출력 후 다시 메뉴로 이동
				// 가격 입력시 음수 입력하면 다시 바로 가격을 입력 받도록

				HashMap<String, Object> map = new HashMap<>();

				
				
				System.out.print("이름 : ");
				String name = s.next();
				if (isDuplicated(list, name))
					continue;
				map.put("name", name);

				System.out.print("가격 : ");
				int price = s.nextInt();
//				if(checkNegative(price)) {
//					""
//				}
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

				update(list, s.next());

			} else if (menu == 3) {
				// 과일 검색
				System.out.print("구매할 과일 이름 : ");
				HashMap<String, Object> map = findDuplicateMap(list, s.next());

				System.out.print("구매할 수량 : ");
				updateAmount(map, s.nextInt());

			} else if (menu == 4) {
				printList(list);
			} else {
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}
	
	private static void createFruit(HashMap<String, Object> map) {
		
	}

	private static HashMap<String, Object> findDuplicateMap(ArrayList<HashMap<String, Object>> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).containsValue(name)) {
				return list.get(i);
			}
		}
		return null;
	}

	private static boolean isDuplicated(ArrayList<HashMap<String, Object>> list, String name) {

		if (findDuplicateMap(list, name) == null)
			return false;

		System.out.println("이미 등록된 과일입니다.");
		return true;
	}

	private static void update(ArrayList<HashMap<String, Object>> list, String name) {
		HashMap<String, Object> map = findDuplicateMap(list, name);
		if (map == null) {
			System.out.println("해당 과일 없습니다.");
			return;
		}
		updatePrice(map);
		updateAmount(map);
	}

	private static void updatePrice(HashMap<String, Object> map) {
		System.out.print("가격 : ");
		map.put("price", s.nextInt());
	}

	private static void updateAmount(HashMap<String, Object> map) {
		System.out.print("수량 : ");
		map.put("amount", s.nextInt());
	}

	private static void updateAmount(HashMap<String, Object> map, int amount) {
		map.put("amount", (int) map.get("amount") - amount);
		printFruitMap(map);
	}

	private static void printFruitMap(HashMap<String, Object> map) {
		System.out.println("\n===================================");
		System.out.println("이름 : " + map.get("name") + ", 가격 : " + map.get("price") + ", 재고 : " + map.get("amount"));
		System.out.println("===================================");
	}

	private static void printList(ArrayList<HashMap<String, Object>> list) {
		if (list.isEmpty()) {
			System.out.println("\n===================================");
			System.out.println("오픈 준비 중");
			System.out.println("===================================");
		}
		Iterator<HashMap<String, Object>> it = list.iterator();
		while (it.hasNext()) {
			printFruitMap(it.next());
		}
	}
	
	private static boolean checkNegative(int num) {
		if(num>0) return false;
		return true;
	}
}
