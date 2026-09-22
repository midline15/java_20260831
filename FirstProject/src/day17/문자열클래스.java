package day17;

public class 문자열클래스 {

	public static void main(String[] args) {

		String text = "abcdefgh";

		String result1 = text.substring(3); // 인덱스부터 끝까지 문자열 리턴
		System.out.println(result1);

		String result2 = text.substring(3, 6); // 3부터 6이전까지 문자열 리턴
		System.out.println(result2);

		int result3 = text.indexOf("c"); // 문자열의 처음 인덱스
		System.out.println(result3);
		
		int result4 = text.lastIndexOf("c"); // 문자열의 가장 나중 인덱스
		System.out.println(result4);
		
		String result5 = String.valueOf(text.charAt(3)); // 해당 인덱스의 문자 리턴
		System.out.println(result5);
		
		String result6 = text.replace('a', 'A'); // 문자 찾아 바꾸기
		System.out.println(result6);
	}

}
