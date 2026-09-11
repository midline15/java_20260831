package day04;

public class _9_생성자 {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 10 ,"인천",170);
		Person kim = new Person("김철수");		
		
		System.out.println(hong.height);
		
		Person park = new Person("박영희",20,"제주도");
		
	}

}
