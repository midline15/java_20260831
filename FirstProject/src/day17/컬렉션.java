package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 문자열 5개 입력받아서 리스트에 넣기
		Scanner s = new Scanner(System.in);

		ArrayList<String> list = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 문자 입력 : ");
			list.add(s.next());
		}
		s.close();
		
		System.out.println(list);

		// 문자열의 길이가 가장 큰 텍스트 출력

		int maxIndex = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() > list.get(maxIndex).length()) {
				maxIndex = i;
			}
		}

		System.out.println(list.get(maxIndex));
		
		// 최대 길이와 같은 문자열 모두 출력

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() == list.get(maxIndex).length()) {
				System.out.println(list.get(i));
			}
		}
	}

}
