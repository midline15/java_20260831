package day05;

public class Food {

	String name;
	int price;

	Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void info() {
		System.out.println(name + "은 " + price + "원입니다.");
	}

}
