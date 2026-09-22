package day17;

import java.util.HashMap;
import java.util.Scanner;

public class 연습문제4 {

	public static void main(String[] args) {

		// 스캐너를 통해 문자열을 입력받고
		// 각 문자가 몇번 나오는지 출력(대소문자 구분x)
		
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.print("입력 : ");
		String str = s.nextLine().toLowerCase().replace(" ", ""); //replaceAll("\\s", "");
		
		for (int i = 0; i < str.length(); i++) {
			String key = str.substring(i,i+1);
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
	}

}
