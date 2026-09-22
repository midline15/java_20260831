package day17;

import java.util.Random;

public class Fish extends GameObject {

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		Random r = new Random();
		distance = r.nextInt(3);
		int direction = r.nextInt(4);
		if (direction == 0 && x != 0) {
			x -= distance;
		} else if (direction == 1 && y != 9) {
			y += distance;
		} else if (direction == 2 && y != 0) {
			y -= distance;
		} else if (direction == 3 && x != 19) {
			x += distance;
		}

	}

	@Override
	protected char getShape() {
		return '@';
	}

}
