package day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList예제3 {

	public static void main(String[] args) throws Exception{

		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 30);
		Human park = new Human("박영희", 30);

		ArrayList<Human> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		
//		System.out.println(list);

		// 사람 이름 입력받고 list 에 있는지 검색
		//  있으면 "있습니다" 출력 후 종료
		// 없으면
		String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("있습니다");
				break;
			}
		}
	}

}
