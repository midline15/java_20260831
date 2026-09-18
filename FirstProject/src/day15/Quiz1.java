package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) throws IOException {
		// 영문 텍스트를 입력하고 세미콜론을 입력하세요
		// 알파벳 갯수 세기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		String s = "";
		while (true) {
			String str = br.readLine().toUpperCase();
			if (str.equals(";")) {
				break;
			}
			s += str;
		}

		HashMap<Character, Integer> map = new HashMap();
		char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < c.length; i++) {
			map.put(c[i], 0);
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}

		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			for (int j = 0; j < map.get(c[i]).intValue(); j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
