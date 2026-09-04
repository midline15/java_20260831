package day5;

import java.util.Arrays;

public class _8_Value_Ref {

	static void valueMethod(int a) {
		a += 1;
	}

	static void refMethod(int[] arr) {
		arr[0] = 1000;
	}

	static void refMethod(Animal animal) {
		animal.age += 1;
	}

	public static void main(String[] args) {

		int a = 10;
		valueMethod(a);
		System.out.println(a);

		int arr[] = { 1, 2, 3, 4, 5 };
		refMethod(arr);
		System.out.println(Arrays.toString(arr));

		Animal dog = new Animal("강아지", "댕댕이", 5);
		System.out.println("호출전 " + dog.age);
		refMethod(dog);
		System.out.println("호출후 " + dog.age);

		// 배열의 값을 복사하고 싶을 때

		int arr2[] = { 3, 5, 2, 4, 1 };
//		int copyArr[] = arr2; // 하나의 배열을 두이름으로 참조
		int copyArr[] = new int[arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			copyArr[i] = arr2[i];
		}

	}

}
