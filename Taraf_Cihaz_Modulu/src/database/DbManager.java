package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager extends DbConnection {

	// Her bir class'ın kendine ait bir write metodu mu olmalı, yoksa tek bir write metodu içinde birden fazla kontrol ile (if-else) mi yapılmalı? 

	
	public void ExecuteQuery(String query) {
		Connection conn = ConnectToDb();
		System.out.println(conn);
		Statement statement = null;
		try {
			statement = conn.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DisconnectFromDb();
			
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		String query = "INSERT INTO public.taraf_cihaz_plt_2saat "
				+ "VALUES (0,0,1,1,1,0,0,0)";
		DbManager temp = new DbManager();
		try {
			temp.ExecuteQuery(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
