package day17;

import java.util.Random;

public class Game {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");

		Bear bear = new Bear(r.nextInt(20), r.nextInt(10), 1);
		Fish fish;
		while (true) {
			int fishX = r.nextInt(20);
			int fishY = r.nextInt(10);
			if (fishX != bear.getX() || fishY != bear.getY()) {
				fish = new Fish(fishX, fishY, 2);
				break;
			}
		}
		while (true) {

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					if (bear.getX() == j && bear.getY() == i) {
						System.out.print(bear.getShape());
					} else if (fish.getX() == j && fish.getY() == i) {
						System.out.print(fish.getShape());
					} else {
						System.out.print('-');
					}
				}
				System.out.println();
			}
			if(bear.collide(fish)) {
				System.out.println("Bear Wins!");
				break;
			}
			System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
			bear.move();
			fish.move();

		}

	}

}
