package day17;

import java.util.Scanner;

public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if (c == 'a' && x != 0) {
			x -= distance;
		} else if (c == 's' && y != 9) {
			y += distance;
		} else if (c == 'd' && y != 0) {
			y -= distance;
		} else if (c == 'f' && x != 19) {
			x += distance;
		}
//		s.close();
	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
