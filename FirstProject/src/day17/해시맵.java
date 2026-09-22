package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 해시맵 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		// 1부터 10 사이 숫자를 10번 입력받고(중복 가능)
		// 각 숫자를 몇번 입력했는지 출력
		
		Scanner s = new Scanner(System.in);
		int count = 1;
		while(count <= 10) {
			System.out.print(count + "번째 숫자 입력 : ");
			int num = s.nextInt();
			if(num >= 1 && num <= 10) {
				count++;
				map.put(num, map.getOrDefault(num, 0)+1);
				
			}else {System.out.println("1이상 10이하 숫자 입력");}
		}
		System.out.println(map);
		
	}

}
