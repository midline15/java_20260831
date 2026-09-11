package day06;

public class _1_클래스복습 {

	public static void main(String[] args) {

		Food food1 = new Food();
		Food food2 = new Food("라면", 3000);
		Food food3 = new Food("비빔밥", 8000, "한식");
		
		String info = food2.getInfo();
		System.out.println(info);
		System.out.println(food3.getInfo());
		
		// 이름, 가격,  종류 중 하나라도 값이 없으면
		// "정보가 없습니다." 출력
		System.out.println(food1.getInfo());
		
		food2.setPrice(4000);
		System.out.println(food2.getPrice());
		
	}

}
