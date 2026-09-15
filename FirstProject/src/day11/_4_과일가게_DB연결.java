package day11;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day10.MyFunction;

public class _4_과일가게_DB연결 {

	static Scanner s = new Scanner(System.in);
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();

	static int checkNum(String msg) {
		while (true) {
			System.out.print(msg);
			int num = s.nextInt();
			if (num > 0) {
				return num;
			}
			System.out.println("0보다 큰수를 입력하세요");
		}
	}
	
	static int checkNum(String msg, int min, int max) {
		while(true) {
			System.out.print(msg);
			int input = s.nextInt();
			if(input>=min && input<=max) {
				return input;
			}
			System.out.println("숫자의 범위는 "+min+" ~ "+max+" 입니다.");
		}
	}

	static void addFruit() {
		System.out.println("=== 과일 추가 ===");
		// 1. 과일 이름 입력받아서 있는 과일이면 이미 존재하는 과일입니다
		// 출력 후 메뉴로 이동
		// 2. 없는 과일이면 과일 이름 가격 개수를 입력받아서 db에 저장.
		// 3. 가격과 개수를 입력받을 때는 0이하의 숫자를 입력할 경우
		// 경고 후 다시 입력하도록(메소드 따로)
		try {
			String sql;
			System.out.print("과일 이름 : ");
			String fruitName = "'" + s.next() + "'";

			sql = "select * from fruit where fruit_name = " + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("이미 존재하는 과일 입니다.");
			} else {
				int price = checkNum("가격 : ");
				int cnt = checkNum("수량 : ");
				sql = "INSERT INTO FRUIT " + "VALUES (" + fruitName + ", " + price + ", " + cnt + ")";
				int succese = stmt.executeUpdate(sql);
				if (succese > 0) {
					System.out.println("등록되었습니다.");
				} else {
					System.out.println("등록에 실패했습니다.");
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void updateFruit() {
		System.out.println("=== 가격 수정 ===");
		// 1. 과일 이름 입력받아서 있는 과일이면 현재 가격 출력
		// 없는 과일이면 '해당 과일 없습니다.' 출력후 메뉴로 이동
		// 2. 새로운 가격을 입력받아서 해당 가격으로 수정

		try {
			System.out.print("과일 이름 : ");
			String fruitName = "'" + s.next() + "'";
			String sql = "select price from fruit where fruit_name = " + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.print(fruitName + "의 가격은 " + rs.getInt("price") + "원 입니다.\n");
				System.out.print("가격 수정 : ");
				int price = s.nextInt();
				String sql2 = "update fruit set price = " + price + " where fruit_name = " + fruitName;
				int cnt = stmt.executeUpdate(sql2);
				if (cnt > 0) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("수정에 실패했습니다.");
				}
			} else {
				System.out.println("해당 과일은 존재하지 않습니다.");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void sellFruit() {
		System.out.println("=== 과일 판매 ===");
		// 1. 판매할 과일 이름 입력하기
		//		해당 과일 db에 없으면 없다는 문구 출력후 메뉴로 이동
		// 2. 과일이 있을 경우 현재 개수 알려주고 구매할 개수 입력받기
		// 3. 구매개수는 1이상, 현재개수보다 작은 숫자 입력 받기
		//		해당 범위 벗어날 경우 안내문구 후 다시 입력하도록 유도
		// 4. 정상 범위 입력했을 경우 기존 개수에서 차감 후 메뉴로 이동
		
		try {
			System.out.print("과일 이름 : ");
			String fruitName = "'" + s.next() + "'";
			String sql = "select cnt from fruit where fruit_name = " + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.print(fruitName + "의 수량은 " + rs.getInt("cnt") + "개 입니다.\n");
				int cnt = checkNum("구매할 수량 : ", 1, rs.getInt("cnt"));
				sql = "update fruit set cnt = cnt - " + cnt + " where fruit_name = " + fruitName;
				int flag = stmt.executeUpdate(sql);
				if (flag > 0) {
					System.out.println("판매되었습니다.");
				} else {
					System.out.println("오류가 발생했습니다.");
				}
			} else {
				System.out.println("해당 과일은 존재하지 않습니다.");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void checkFruit() {
		System.out.println("=== 과일 확인 ===");

		try {
			System.out.print("과일 이름 : ");
			String fruitName = "'" + s.next() + "'";

			String sql = "select * from fruit where fruit_name = " + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.print(fruitName + "의 가격은 " + rs.getInt("price") + "원 입니다.\n");
				System.out.println("남은 개수는 " + rs.getInt("cnt") + "개 입니다.");
			} else {
				System.out.println("해당 과일은 존재하지 않습니다.");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void deleteFruit() {
		try {
			// 과일 이름 입력
			// "정말 삭제하시겠습니까?" 물어보고 y or Y 입력
			// db에 삭제 요청
			// 삭제 성공하면 "삭제되었습니다"
			// 실패하면 "과일이름을 확인해주세요"

			System.out.print("과일 이름 : ");
			String fruitName = "'" + s.next() + "'";
			System.out.print("정말 삭제하시겠습니까?(y 삭제) : ");
			String delete = s.next().toLowerCase();
			if (delete.equals("y")) {
				String sql = "delete from fruit where fruit_name = " + fruitName;
				int cnt = stmt.executeUpdate(sql);
				if (cnt > 0) {
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("과일 이름을 확인해주세요.");
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		try {

			while (true) {
				System.out.print("[  (1) 과일 추가  (2) 가격 수정  (3) 판매  (4) 과일 확인  (5) 삭제  (0) 종료  ] : ");
				int menu = s.nextInt();

				switch (menu) {
				case 1:
					addFruit();
					break;
				case 2:
					updateFruit();
					break;
				case 3:
					sellFruit();
					break;
				case 4:
					checkFruit();
					break;
				case 5:
					deleteFruit();
					break;
				default:
					System.out.println("종료되었습니다.");
					break;
				}
				if(menu == 0) break;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
