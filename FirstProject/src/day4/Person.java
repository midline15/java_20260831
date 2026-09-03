package day4;

public class Person {

	String name;
	int age;
	String addr;
	double height;

	// 생성자는 메소드. 다만, 일반 메소드랑 차이가 있다.
	// 리턴 타입 x, 오버로딩, 객체 초기화
	Person(String name) {
		this.name = name;
	}

	Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	Person(String name, int age, String addr, double height) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
	}

}
