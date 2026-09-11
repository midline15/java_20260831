package day08;

public class Fruit {

	private String name;
	private int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	// 아래 첫번째 조건문의 프린트문이 출력 되도록 equals 메소드 오버라이딩
	// (과일 이름과 가격이 같으면 같은 객체로 취급)
	public static void main(String[] args) {
		
		Fruit apple1 = new Fruit("사과", 1000);
		Fruit apple2 = new Fruit("사과", 1000);
		Fruit banana = new Fruit("바나나", 500);

		if(apple1.equals(apple2)) {
			System.out.println("같은 과일 입니다!!!!"); // 출력
		} 

		if(apple1.equals(banana)) {
			System.out.println("같은 과일 입니다!"); // 미출력
		} 
		
	}
	
	@Override
	public boolean equals(Object o) {
		Fruit f = (Fruit) o;
		
		 return name.equals(f.name) && price == f.price;
	}
	
}
