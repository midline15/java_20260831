package day17;

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
		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine().toUpperCase().replace(" ", "");
			if (str.equals(";")) {
				break;
			}
			sb.append(str);
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < 26; i++) {
			map.put((char) ('A' + i), 0);
		}

		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
		}

		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < map.size(); i++) {
			char c = (char) ('A' + i);
			System.out.print(c);
			for (int j = 0; j < map.get(c); j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
