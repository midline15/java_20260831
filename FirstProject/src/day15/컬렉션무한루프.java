package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class 컬렉션무한루프 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <HashMap> list = new ArrayList();
		System.out.println("====== 포인트 관리 프로그램 ======");
	
		while(true) {
			System.out.println("[ (1)회원추가 (2) 확인 (3) 그외 ]");
			int menu = Integer.parseInt(br.readLine());
			
			if(menu == 1) {
				// 이름 , 포인트, 입력받아서 map 저장 후 list 저장
				// 포인트 0이하, 10000초과 입력할 경우
				// 1~10000 사이 값을 입력해주세요. 출력 후 다시 입력받도록
				HashMap<String, Object> map = new HashMap();
				System.out.print("이름 : ");
				map.put("name", br.readLine());
				while(true) {
					System.out.print("포인트 : ");
					int point = Integer.parseInt(br.readLine());
					if(!(point<1 || point > 10000)) {
						map.put("point",point);
						break;
					}
					System.out.println("1~10000 사이 값을 입력해주세요.");
				}
				list.add(map);
			}
			else if(menu == 2) {
				System.out.println(list);
			}
			else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
