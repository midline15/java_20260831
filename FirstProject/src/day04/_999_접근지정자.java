package day04;

import day05.User;

public class _999_접근지정자 {

	public static void main(String[] args) {

		User user = new User();
		user.name = "홍길동"; // public
//		user.age=30; // default 패키지가 다름
//		user.addr="인천"; // protected 패키지가 다름
//		user.gender="남자"; private
		
	}

}
