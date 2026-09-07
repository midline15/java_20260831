package day6;

public class Human {

	private String name;
	private int age;
	private String addr;

	Human() {
	}

	Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	void eat(String food) {
		System.out.println(food + "을 먹는다.");
	}

	void sleep() {
		System.out.println("잠을 잔다.");
	}

	void walk() {
		System.out.println("걷는다.");
	}

	String getInfo() {
		return name + ", " + age + ", " + addr;
	}

}
