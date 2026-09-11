package day04;

public class Human {

	// field
	String name;
	int age;
	String addr;
	double height;

	// method
	void eat() {
		System.out.println(name + "가 밥을 먹는다.");
	}

	void sleep() {
		System.out.println("잠을 잔다.");
	}

	void walk(double km) {
		System.out.println(km + "km을 걷는다.");
	}

}
