package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class 연습문제2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("java");
		list.add("html");
		list.add("oracle");
		System.out.println(list);
		
		// 새로운 리스트를 만들어서 중복없이 
		// 기존 리스트의 과목명을 채운 후 출력
		// 출력결과 : [ java, oracle, html ]
		ArrayList<String> newList = new ArrayList<>();
		for (String str : list) {
			if(!newList.contains(str)) {
				newList.add(str);
			}
		}
		System.out.println(newList);
		System.out.println(new HashSet<String>(list));
		System.out.println(new LinkedHashSet<String>(list));
	}

}
