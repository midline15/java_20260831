package dya3;

public class _13_반복문_while {

	public static void main(String[] args) {

//		while(true) {} 무한루프

		/*
		 * int i = 1; while (i <= 10) {
		 * 
		 * System.out.println(i++);
		 * 
		 * }
		 */

		// while 문을 이용해서 구구단을 작성

		int y = 0;

		while (y < 10) {

			int x = 2;

			while (x < 10) {
				if (y == 0) {
					System.out.print((x) + "단\t\t");
				} else {
					System.out.print(x + " * " + y + " = " + x * y + "\t");
				}

				x++;

			}

			y++;
			System.out.println();

		}

	}

}
