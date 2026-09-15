package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day11.DBClass;

public class _1_성적관리프로그램_DB {
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);

	public static void inputScore() {
		// 성적 입력
		// 테이블명 : STUDENT, 컬럼 : STU_NO(학번), STU_NAME(이름), JAVA(자바점수), ORACLE(오라클점수),
		// HTML(HTML점수)
		// 학번, 이름, 3개 과목의 점수를 입력받아 STUDENT 테이블에 저장
		System.out.println("=== 성적 입력 ===");
		try {
			// 조건 1. 학번은 무조건 4글자(4자리 숫자). 잘못 입력할 경우 다시 입력받도록 함.
			String stuNo = stringLengthLimit("학번", 4);
			// 조건 2. 학번은 중복되면 안됨(PK). 학번 입력받은 후 검색해보고 없을 경우 삽입
			// 중복된 학번을 입력할 경우 알림 메시지 후 메뉴로 이동 함.
			String sql = "select stu_no from student where stu_no = " + stuNo;
			ResultSet rs = stmt.executeQuery(sql);
			if (!rs.next()) {
				String stuName = stringLengthLimit("이름", 20);
				// 조건 3. 각 과목의 점수는 0~100 사이 값이여야 함.
				// 잘못된 범위를 입력할 경우 다시 입력받도록 함.
				int java = insertScoreBoundary("자바", 0, 100);
				int oracle = insertScoreBoundary("오라클", 0, 100);
				int html = insertScoreBoundary("HTML", 0, 100);
				sql = "insert into student values(" + stuNo + "," + stuName + "," + java + "," + oracle + "," + html
						+ ")";
				int flag = stmt.executeUpdate(sql);
				if (flag != 0) {
					System.out.println("성적을 등록했습니다.");
				} else {
					System.out.println("등록에 실패했습니다.");
				}
			} else {
				System.out.println("이미 등록된 학생입니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void rank() {
		// 순위 출력
		// 1등 : ooo(학번), ooo(이름), oo점(평균점수)
		// 2등 : ooo(학번), ooo(이름), oo점(평균점수)
		// ..
		// oo등 : ooo(학번), ooo(이름), oo점(평균점수)
		System.out.println("=== 순위 ===");
		try {
			String sql = "select stu_no, stu_name, round((java+oracle+html)/3, 2) as 평균 from student order by 평균 desc";
			ResultSet rs = stmt.executeQuery(sql);
			int rank = 1;
			while (rs.next()) {
				System.out.println(rank + "등 : " + rs.getString("stu_no") + ", " + rs.getString("stu_name") + ", "
						+ rs.getDouble("평균") + "점(평균점수)");
				rank++;

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void updateScore() {
		// 성적 수정
		// 학번을 입력받은 후 해당 학생의 과목 점수 수정
		// 입력한 학번의 학생이 없을 경우 메뉴로 이동
		// 학번이 있을 경우 새로운 메뉴 '[ (1) 자바 (2) 오라클 (3) HTML ]' 을 띄우고
		// 선택한 메뉴의 점수만 입력받아서 수정( ex : 2번 선택 후 점수 입력받으면 오라클 점수만 수정 )
		// 1~3번 외에 다른 숫자 입력 시 다시 입력받도록 하며, 점수의 범위는 0~100 사이
		System.out.println("=== 성적 수정 ===");
		try {
			String stuNo = stringLengthLimit("학번", 4);
			String sql = "select stu_no from student where stu_no = " + stuNo;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				int score = 0;
				String subject = "";
				while (true) {
					System.out.print("[ (1) 자바 (2) 오라클 (3) HTML ] : ");
					int menu = s.nextInt();
					if (menu == 1) {
						score = insertScoreBoundary("자바", 0, 100);
						subject = "java";
						break;
					} else if (menu == 2) {
						score = insertScoreBoundary("오라클", 0, 100);
						subject = "oracle";
						break;
					} else if (menu == 3) {
						score = insertScoreBoundary("html", 0, 100);
						subject = "html";
						break;
					} else {
						System.out.println("다시 입력하세요.");
					}
				}

				sql = "update student set " + subject + " = " + score + " where stu_no = " + stuNo;
				int flag = stmt.executeUpdate(sql);
				if (flag == 1) {
					System.out.println("성적을 수정했습니다.");
				} else {
					System.out.println("수정을 실패했습니다.");
				}
			} else {
				System.out.println("학번을 확인해주세요");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void removeScore() {
		// 삭제
		// 학번을 입력받은 후 해당 학번을 가진 학생 삭제
		// 따로 중복체크 없이 삭제 요청 후 삭제 여부에 따라 성공or실패 메시지 출력
		// 삭제하기전 정말 삭제할지 (Y or N) 묻고 진행
		System.out.println("=== 삭제 ===");
		try {
			String stuNo = stringLengthLimit("학번", 4);
			System.out.print("정말 삭제하시겠습니까?(y 삭제) : ");
			if (s.next().toLowerCase().equals("y")) {
				String sql = "delete from student where stu_no = " + stuNo;
				if (stmt.executeUpdate(sql) == 1) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void passFail() {
		// pass or fail
		// 학번 입력 후 해당 학번 학생이 있을 경우 pass or fail 여부 알려주기
		// 학번 없을 경우 메뉴로 이동
		// pass여부는 평균 점수가 60점 이상이며, 한과목이라도 40점 미만이 있을 경우 fail
		// 출력할때는 평균점수와 각 과목의 점수, pass or fail 여부를 출력
		System.out.println("=== 합격 여부 ===");
		try {
			String stuNo = stringLengthLimit("학번", 4);
			String sql = "select s.*, round((java+oracle+html)/3, 2) as 평균 from student s where stu_no = " + stuNo;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("이름 : "+rs.getString("stu_name") + "\t평균 : " + rs.getDouble("평균"));
				System.out.println("자바 : "+rs.getInt("java") +"\t오라클 : "+rs.getInt("oracle")+"\tHTML : "+rs.getInt("html"));
				if (rs.getDouble("평균") >= 60 && rs.getInt("java") >= 40 && rs.getInt("oracle") >= 40
						&& rs.getInt("html") >= 40) {
					System.out.println("PASS");
				}else {
					System.out.println("FAIL");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			while (true) {
				System.out.print("[ (1) 성적입력  (2) 순위 (3) 성적수정 (4) 삭제 (5) 합격여부 (그 외) 종료 ] : ");
				int menu = s.nextInt();

				switch (menu) {
				case 1:
					inputScore();
					break;
				case 2:
					rank();
					break;
				case 3:
					updateScore();
					break;
				case 4:
					removeScore();
					break;
				case 5:
					passFail();
					break;
				default:
					System.out.println("종료되었습니다.");
					break;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	private static int insertScoreBoundary(String msg, int min, int max) {
		while (true) {
			System.out.print(msg + " : ");
			int score = s.nextInt();
			if (score >= 0 && score <= 100) {
				return score;
			}
			System.out.println("점수를 다시 입력하세요.(0~100)");
		}
	}

	private static String stringLengthLimit(String msg, int length) {
		while (true) {
			System.out.print(msg + " : ");
			String str = s.next();
			if ((msg.equals("학번") && str.length() == length) || (msg.equals("이름") && str.length() <= length)) {
				return "'" + str + "'";
			}
			System.out.println(msg + "은 " + length + "자리입니다. 다시 입력하세요.");
		}
	}

}
