package day15;

public class 디버깅 {

	public static void main(String[] args) {
		int arr[] = {3,5,58,4,3,2,1};
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
	}

}
