package day6;

public class TJ_Student {

	String name;
	int stuNo;
	int money; // 개인 보유 금액
	static int classMoney = 500000; // 회비; 전체가 공유하는 값

	public TJ_Student(String name, int stuNo, int money) {
		this.name = name;
		this.stuNo = stuNo;
		this.money = money;
	}
	

	static void classMoneyInfo() {
		System.out.println("남은 회비 : " + classMoney);
	}
	
	void moneyInfo() {
		System.out.println("남은 금액 :  " + money);
	}
	
}
