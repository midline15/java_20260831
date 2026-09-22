package day17_test;

import java.util.ArrayList;
import java.util.Comparator;

public class Test7 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("mysql");
		list.add("css");
		list.add("html");
		list.add("oracle");
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
	}

}
