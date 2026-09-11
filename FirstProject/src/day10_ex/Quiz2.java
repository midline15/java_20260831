package day10_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz2 {
	public static ArrayList<HashMap<String, String>> quizList() {
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = { "멕시코", "스페인", "프랑스", "영국", "그리스", "독일", "중국", "러시아", "일본", "대한민국", "이탈리아", "캐나다", "브라질", "인도",
				"이집트", "호주", "터키", "노르웨이" };
		String[] values = { "멕시코시티", "마드리드", "파리", "런던", "아테네", "베를린", "베이징", "모스크바", "도쿄", "서울", "로마", "오타와", "브라질리아",
				"뉴델리", "카이로", "캔버라", "앙카라", "오슬로" };

		for (int i = 0; i < keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, String>> quizList = quizList();

		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");
		Collections.shuffle(quizList);

		for(int i = 0; i <quizList.size(); i++) {
			String quiz = quizList.get(i).keySet().toString();
			String correct = quizList.get(i).get(quiz.substring(1, quiz.length()-1));
			System.out.print(quiz + "의 수도는? >> ");
			String answer = s.next();
			if (answer.equals("-1")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if (answer.equals(correct)) {
				System.out.println("정답!");
			} else {
				System.out.println(correct +"  "+answer);
				System.out.println("오답!");
			}

		}
	
	}
}
