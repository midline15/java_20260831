package day05;

public class Animal {

	String kind;
	String name;
	int age;

	Animal() {
	}

	Animal(String kind, int age) {
		this(kind, "이름미정", age);
	}

	Animal(String kind, String name, int age) {
		this.kind = kind;
		this.name = name;
		this.age = age;
	}

}
