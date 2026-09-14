package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClass {

	private Connection conn;
	private Statement stmt = null;

	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test12#$";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("에러 발생!");
		}
	}

	public Statement getStmt() {
		return stmt;
	}
}
