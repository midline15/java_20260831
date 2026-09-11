package day06;

public class Food {

	// 클래스는 객체를 만드는 틀(설계도, 도구 등)로 표현할 수 있다.
	// 필드(변수) + 메소드로 구성되어 있다.
	// 클래스를 통해서 객체를 생성할 때 객체를 초기화 하는 메소드 => 생성자

	// # 생성자 특징
	// (1) 객체를 초기화 하는 용도로 사용된다.
	// (2) 생성자를 직접 만들지 않으면 기본 생성자가 자동으로 만들어진다.
	// (3) 클래스 이름과 동일한 이름의 메소드
	// (4) 리턴타입이 없다.
	// (5) 오버로딩(overloading)이 가능하다.

	// 접근지정자
	// public, default, protected, private
	private String name;
	private int price;
	private String kind;

	Food() {
		// name, kind => null
		// price => 0
	}

	// 이름, 가격을 입력받아서 초기화하는 생성자
	Food(String name, int price) {
		this(name, price, "미정");
	}

	// 3개의 값 모두 입력받아서 초기화하는 생성자
	Food(String name, int price, String kind) {
		this.name = name;
		this.price = price;
		this.kind = kind;
	}
	
	String getInfo() {
		if(name == null || price ==0 || kind == null) {
			return "정보가 없습니다.";
		}
		// 음식이름 : name, 가격 : price원, 종류 : kind
		return "음식이름 : "+name +", 가격 : " + price + "원, 종류 : "+ kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price <= 0) {
			System.out.println("가격은 1원 이상 입력해주세요.");
			return;
		}
		
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}	
	
}
