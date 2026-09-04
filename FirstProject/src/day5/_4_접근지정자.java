package day5;

public class _4_접근지정자 {

	public static void main(String[] args) {

		User user = new User();
		user.name = "홍길동"; // public
		user.age=30; // default
		user.addr="인천"; // protected
//		user.gender="남자"; private
		
	}

}
