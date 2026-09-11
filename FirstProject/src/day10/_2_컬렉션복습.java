package day10;

import java.util.HashMap;

public class _2_컬렉션복습 {

	public static void main(String[] args) {

		// HashMap => {key = value}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("age_", 30);
		map.put("height", 170.1);
		
		System.out.println(map);
		
		if(map.containsKey("age")) {
			System.out.println((int)map.get("age")+1);			
		}
		
	}

}
