package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_JSON {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		System.out.println("====== 성적 입력 프로그램 ======");

		for (int i = 0; i < 3; i++) {

			HashMap<String, Object> map = new HashMap<>();
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			map.put("name", name);
			
			System.out.print("java 점수 : ");
			String java = scan.nextLine();
			map.put("java", java);
			
			System.out.print("db 점수 : ");
			String db = scan.nextLine();
			map.put("db", db);
			
			list.add(map);
			System.out.println("===============================");
		}
		
		System.out.println(list);

	}

}
