package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _1_db연결 {

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test12#$";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
			System.out.println("DB 연결 완료");

			ResultSet rs = stmt.executeQuery("select * from fruit");
			System.out.println(rs);
			while (rs.next()) {
				System.out.println("과일명 : " + rs.getString("fruit_name"));
				System.out.println("가격 : " + rs.getInt("price"));
				System.out.println("=====================");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
