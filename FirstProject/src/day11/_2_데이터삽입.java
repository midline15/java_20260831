package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _2_데이터삽입 {

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
			
			String sql = "insert into fruit values ('딸기', 30000, 10)";
			int num = stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("DB 연결 오류");
		}
	}

}
