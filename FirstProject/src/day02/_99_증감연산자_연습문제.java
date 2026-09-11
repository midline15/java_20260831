package day02;

public class _99_증감연산자_연습문제 {

	public static void main(String[] args) {

		int a = 5;
		int b = --a; // b =4, a =4
		int c = b++; // b =5, c = 4, a=4
		int d = ++a; // d= 5, c=4, b= 5, a=5
		int e = c--; // e=4, d =5, c =3 , b= 5, a = 5
		c = ++a; // a = 6, b = 5, c = 6, d = 5, e = 4
	}

}