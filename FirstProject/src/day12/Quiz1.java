package day12;

import java.util.Arrays;

public class Quiz1 {
	 

	 public static void main(String[] args) {
	        int [] array1 = {1,5,7,9};
	        int [] array2 = {3,6,-1,100,77};
	        int [] array3 = ArrayFunc.concat(array1, array2);
	        System.out.println(Arrays.toString(array3));
	    }
}
class ArrayFunc {

	public static int[] concat(int[] array1, int[] array2) {
		int [] arr = new int[array1.length+array2.length];
		for(int i = 0; i < arr.length; i++) {
			if (i< array1.length)
				arr[i] = array1[i];
			else
				arr[i] = array2[i-array1.length];
		}
		return arr;
	}

}