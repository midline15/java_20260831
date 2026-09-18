package day15;

import java.util.ArrayList;

public class ArrayList예제2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0; i <6; i ++) {
			int randomNumber = (int)(Math.random()*45)+1;
			if(list.contains(randomNumber)) {
				i--;
			}else {
				list.add(randomNumber);
			}
		}
		
		System.out.println(list);
		
	}

}
