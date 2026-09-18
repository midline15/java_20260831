package day15;

public class Food {

	private String name = "이름없음";
	private int price = 0;
	private int count = 0;
	static final String marketName = "코딩천국";
	
	Food(){}
	Food(String name, int price){
		this(name, price, 0);
	}
	Food(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	
	
	
}
