package dya3;

import java.util.Random;

public class _7_랜덤숫자 {

	public static void main(String[] args) {

		// Random Class, Math Class
		Random ran = new Random();
		int x = ran.nextInt(10);
		int y = ran.nextInt(6) + 1;
		
		System.out.println(y);
		
	}

}
