package day10;

import java.util.ArrayList;
import java.util.HashMap;

public class _3_컬렉션복습 {

	public static void main(String[] args) {

		// JSON
		// ArrayList 안에 HashMap을 넣은 형대
		HashMap<String, Object> hong = new HashMap<>();
		hong.put	("name", "홍길동");
		hong.put("java", 95);
		hong.put("db", 92);
		hong.put("html", 96);
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put	("name", "김철수");
		kim.put("java", 92);
		kim.put("db", 99);
		kim.put("html", 91);
		System.out.println(kim);
		
		HashMap<String, Object> park = new HashMap<>();
		park.put	("name", "박영희");
		park.put("java", 92);
		park.put("db", 99);
		park.put("html", 91);
		System.out.println(park);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(0).get("name"));
		
		for(int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			System.out.println(user.get("java"));
		}
		
	}

}
