package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _3_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("홍길동", 95);
		map.put("김철수", 91);
		map.put("이영희", 98);
		
		System.out.println(map);
		
		System.out.println(map.get("홍길동"));
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		int sum = 0;
		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key + " : " + map.get(key));
			sum += map.get(it.next());
		}
		System.out.println(sum);
	}
	
}
