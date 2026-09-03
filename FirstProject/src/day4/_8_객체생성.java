package day4;

public class _8_객체생성 {

	public static void main(String[] args) {

		Human hong = new Human();
		hong.name = "홍길동";

		Human kim = new Human();
		kim.name = "김철수";

		Human park = new Human();

		hong.eat();
		kim.eat();

		hong.walk(5);

	}

}
