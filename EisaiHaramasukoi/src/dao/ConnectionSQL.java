package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {

	private static String status = "Não conectou...";
	private static Connection con = null;

	
	public ConnectionSQL(){
		
	}
	
	public static Connection getConnectionMySQL(){
		
		String drivername = "com.mysql.jdbc.Driver";
		String servername = "localhost";
		String mydatabase = "myspace";
		String url = "jdbc:mysql://"+servername+":3306/"+mydatabase;
		String username = "root";
		String password = "123456";
		try {
			con = DriverManager.getConnection(url, username, password);
			
			if(con != null)
				status = "STATUS = conectado com sucesso!";
			else
				status = "STATUS = nao foi possível conectar...";

			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static boolean fecharConect(){
		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ConnectionSQL.getConnectionMySQL();
		System.out.println(ConnectionSQL.status);
		
		try {
			ConnectionSQL.getConnectionMySQL().close();
			System.out.println(ConnectionSQL.fecharConect());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
