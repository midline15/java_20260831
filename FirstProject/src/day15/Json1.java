package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Json1 {

	public static void main(String[] args) {
		//리스트 안에 맵이 있는 형태
		// [{},{},{}]
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap> list = new ArrayList();
		for (int i = 0; i < 3; i++) {
//			System.out.println("===== " +(i+1)+"번 사람 입력 =====");
			HashMap<String, Object> map = new HashMap();
			
//			System.out.print("학번 : ");
			map.put("stuNo", i);
//			System.out.print("이름 : ");
			map.put("name", "이름"+i);
			
			list.add(map);
		}
		System.out.println(list);
		// 검색한 이름이 리스트 안의 맵에 존재하는지 검색
		System.out.print("이름 : ");
		String name = s.next();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).containsValue(name)) {
				System.out.println(list.get(i));
				break;
			}
		}
	}

}
