package day05;

public class Car {

	// field
	String modelName;
	String color;
	private int price;
	int speed;

	// constructor
	Car(String modelName, String color){
		this.modelName = modelName;
		this.color = color;
	}
	
	Car(String modelName, String color, int price) {
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}

	// method
	void speedUp(int speed) {
		this.speed += speed;
		System.out.println("현재 속도는 " + this.speed + "입니다.");
	}

	void speedDown() {
		speed = 0;
		System.out.println("자동차가 정지했습니다.");
	}

	void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("현재 속도는 " + this.speed + "입니다.");
	}

	String carInfo() {
		String info = "모델명 : " + modelName + ", 색상 : " + color;
		return info;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<1) {
			System.out.println("가격은 1이상 입력해주세요");
			return;
		}
		
		this.price = price;
	}
	
}
