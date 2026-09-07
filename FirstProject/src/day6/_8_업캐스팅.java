package day6;

public class _8_업캐스팅 {

	//업캐스팅
	static void fruitBoxing(Fruit f) {
		System.out.println(f.name + "를 포장했습니다.");
	}

	public static void main(String[] args) {

		Fruit f = new Fruit("과일");
		Apple apple = new Apple("사과");
		Orange orange = new Orange("오렌지");
		Banana banana = new Banana("바나나");
		
		fruitBoxing(apple);
		fruitBoxing(orange);
		fruitBoxing(banana);
	}

}
