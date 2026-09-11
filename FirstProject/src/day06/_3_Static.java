package day06;

public class _3_Static {

	public static void main(String[] args) {

		TJ_Student hong = new TJ_Student("홍길동", 1234, 50000);
		TJ_Student kim = new TJ_Student("김철수", 9876, 300000);
		
		kim.money -= 30000;
		System.out.println(hong.money);
		
		kim.classMoney -= 100000;
		System.out.println(hong.classMoney);
		
		TJ_Student.classMoney += 50000;
		System.out.println(TJ_Student.classMoney);
	
		kim.classMoneyInfo();
		
	}

}
