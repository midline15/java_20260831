package day08;

public class _7_서브스트링 {

	public static void main(String[] args) {

		String text = "Hello JAVA";
		System.out.println(text.substring(2, 7));
		
		// 첫글자를 맨 뒤로 보냄
		String result1 = text.substring(1) + text.charAt(0);
		System.out.println(result1.toUpperCase());
		
		for(int i = 0; i <text.length(); i ++) {
			text = text.substring(1) + text.charAt(0);
			System.out.println(text);
		}
		
	}

}
