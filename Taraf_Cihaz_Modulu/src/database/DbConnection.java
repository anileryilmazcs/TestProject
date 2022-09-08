package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	protected Connection conn = null;
	
	public Connection ConnectToDb() {
		
		try {
			if(conn != null && !conn.isClosed()) {
				System.out.println("Already connected to the database. ");
				return conn;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String url = "jdbc:postgresql://10.1.50.66:5432/tekis";

		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "123");
		props.setProperty("ssl", "false");
		
		try {
			this.conn = DriverManager.getConnection(url, props);
		} catch (SQLException e2) {
			System.out.println("haaha");
			e2.printStackTrace();
		}
		return conn;
	}

	
	public void DisconnectFromDb () {
		
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		DbConnection temp = new DbConnection();
		temp.ConnectToDb();
		temp.DisconnectFromDb();
	}
}
