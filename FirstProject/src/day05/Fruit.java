package day05;

public class Fruit {

	private String name; // 과일 이름
	private int count; // 수량
	private int price; // 가격
	
	Fruit(String name, int count, int price){
		this.name = name;
		this.count = count;
		this.price = price;
	}
	
	public void setPrice(int price) {
		if(price <= 0) {
			System.out.println("값을 다시 확인해주세요!");
			return;
		}
		
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
