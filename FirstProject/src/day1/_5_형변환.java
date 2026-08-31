package day1;

public class _5_형변환 {

	public static void main(String[] args) {
		
		int age = 30;
		double age2 = 30;
		
//		int height = 169.9;
		int height = (int) 169.9; // 강제 형변환
		System.out.println(height);
		
		int newAge = age + 1;
		int newAge2 = (int) age2;
	}

}
