package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String english;
	private String korean;

	public Word(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}

	public String getKorean() {
		return korean;
	}

}

public class WordQuiz {
	static Scanner s = new Scanner(System.in);
	private Vector<Word> v;
	private String name;

	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("human", "인간"));
		v.add(new Word("stock", "주식"));
		v.add(new Word("trade", "거래"));
		v.add(new Word("society", "사회"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("honey", "꿀"));
		v.add(new Word("dall", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("fault", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("statue", "조각상"));
	}

	public static void main(String[] args) {
		String name = "영어테스트";
		WordQuiz quiz = new WordQuiz(name);
		System.out.println("\"" + name + "\"의 단어테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + quiz.v.size() + "개의 단어가 들어있습니다.");
		Collections.shuffle(quiz.v);
		Iterator<Word> it = quiz.v.iterator();
		while (it.hasNext()) {
			//보기 목록을 만들고 정답을 제거하고 랜덤 3개+정답
			Word question = it.next();
			System.out.println(question.getEnglish() + "?");
			ArrayList<String> options = new ArrayList<String>();
			for(Word word : quiz.v) {
				options.add(word.getKorean());
			}
			options.remove(question.getKorean());;
			Collections.shuffle(options);
			
			ArrayList<String> option = new ArrayList();
			option.add(options.get(0));
			option.add(options.get(1));
			option.add(options.get(2));
			option.add(question.getKorean());
			Collections.shuffle(option);
			
			System.out.print("(1)" + option.get(0) + " (2)" + option.get(1) + " (3)" + option.get(2) + " (4)"
					+ option.get(3) + " :>");
			int num = s.nextInt()-1;
			if(num == -2) {
				System.out.println("\"" + name + "\"를 종료합니다...");
				break;
			}
			String answer = option.get(num);
		
			if (answer.equals(question.getKorean())) {
				System.out.println("정답! !!");
			} else {
				System.out.println("틀렸음 !!");
			}

		}

	}
}
