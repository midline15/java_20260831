package day06;

public class Student extends Human {

	private int stuNo;

	// 자식클래스로 객체를 만들 때
	// 따로 지정을 하지 않으면 부모클래스의 기본생성자 호출(없으면 오류)
	Student(int stuNo) {
		this.stuNo = stuNo;
	}

	Student(String name, int age, String addr, int stuNo) {
		super(name, age, addr);
		this.stuNo = stuNo;
	}

	void study() {
		System.out.println("공부한다.");
	}

}
