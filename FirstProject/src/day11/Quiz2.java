package day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Quiz2 {

	public static void main(String[] args) {
		System.out.println(countWords("Hello world, hello Java!"));
		int[] arr1 = { 1, 2, 2, 3 };
		int[] arr2 = { 3, 2, 1, 2 };
		System.out.println(hasSameElementCounts(arr1, arr2));
		System.out.println(compressString("aasddfffssskfksnmflkkl"));
	}

//	1. 문장이 주어졌을 때, 각 단어가 몇 번씩 나오는지 세어 Map<String, Integer> 형태로 반환
	// 입력 예시: "Hello world, hello Java!"
	// 출력 예시: {hello=2, world=1, java=1}
	// (대소문자 구분 없이 처리, 마침표/쉼표 같은 기호는 제거)
	public static Map<String, Integer> countWords(String sentence) {
		Map<String, Integer> map = new HashMap<>();
		String[] result = sentence.split("[\\p{P}\\p{S}\\s]+");

		for (String s : result) {
			if (!map.containsKey(s.toLowerCase())) {
				map.put(s.toLowerCase(), 1);
			} else {
				map.put(s.toLowerCase(), map.get(s.toLowerCase()) + 1);
				continue;
			}
		}
		return map;
	}

//	2. 두 정수 배열이 주어졌을 때, 순서는 다르더라도 동일한 숫자들이 동일한 개수만큼 포함되어 있다면 true를 반환
	// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
	// 출력: true

	// 입력: [1, 2, 2], [1, 2, 3]
	// 출력: false
	public static boolean hasSameElementCounts(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean flag = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return true;
			}
		}
		return false;

	}

//	3. 같은 문자가 연속으로 반복될 경우, 문자 뒤에 반복된 횟수를 붙여 압축한 문자열을 반환
	// 입력: "aaabbcddd"
	// 출력: "a3b2cd3"
	public static String compressString(String input) {
		
		char[] result = input.toCharArray();
		String s = "";
		int count = 1;
		for (int i = 0; i < result.length-1; i++) {
			// 인덱스로 비교후 같으면 카운트 증가 1이면 숫자 안붙임.
			if(result[i] == result[i+1]) {
				count++;
			}else if(count == 1){
				s = s+result[i];
			}else {
				s = s + result[i] + count;
				count = 1;
			}
			
			if(i == result.length -2 && count ==1) {
				s = s+ result[i+1];
			}else if(i == result.length -2 && count != 1) {
				s = s + result[i+1] + count;
			}
		}

		return s;
	}
}
