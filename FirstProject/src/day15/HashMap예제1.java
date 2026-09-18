package day15;

import java.util.HashMap;

public class HashMap예제1 {

	public static void main(String[] args) {

		// key, value
		HashMap<String, Object> hong = new HashMap<String, Object>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("height", 170.1);
		
		HashMap<String, Object> addr = new HashMap<String, Object>();
		addr.put("도로명주소", "인천시 부평구");
		addr.put("상세주소", "0동 0호");
		addr.put("우편번호", "123-123");
		
		hong.put("addr", addr);
		System.out.println(hong.get("addr"));

	}

}
