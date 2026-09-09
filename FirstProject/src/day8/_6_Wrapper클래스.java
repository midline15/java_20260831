package day8;

import java.util.HashMap;
import java.util.Vector;

public class _6_Wrapper클래스 {

	public static void main(String[] args) {

		int a = 10;
		Integer b = Integer.valueOf(a);

//		System.out.println(Integer.parseInt("20", 8));

		Object arr[] = { new Fruit("사과", 1000), 3, "ㅋㅋㅋ", true };  // 3 , true 자동 박싱
		
		HashMap<String, Object> map = new HashMap();
		map.put("이름", "홍길동");
		map.put("나이", 30);
		map.put("주소", "인천");
		System.out.println(map);
		
		Vector<Integer> v = new Vector();
		System.out.println(v.capacity());
	}

}
