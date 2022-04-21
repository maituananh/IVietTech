package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class Connect {
	private static String DB_URL = "jdbc:mysql://localhost:3306/iviettech";
	private static String USER_NAME = "root";
	private static String PASSWORD = "r00t";
	private static Connection conn = null;

//	public static void main(String[] args) {
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from student");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//			}
//			conn.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}

	private static Connection getConnection(String dbURL, String userName, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, userName, password);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}

	public static Connection getConn() {
		if (Objects.isNull(conn)) {
			return getConnection(DB_URL, USER_NAME, PASSWORD);
		}
		return conn;
	}

	public static void closeConnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
