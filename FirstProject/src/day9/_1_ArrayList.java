package day9;

import java.util.ArrayList;

public class _1_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(25);
		list.add(12);
		System.out.println(list); // [10, 25, 12]
		
		list.add(1, 100);
		System.out.println(list); // [10, 100, 25, 12]
		System.out.println(list.contains(25)); // true
		
		list.remove(1);
		System.out.println(list); // [10, 25, 12]
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		// add, get, contains, remove
		
	}

}
