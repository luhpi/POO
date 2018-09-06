package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

	private static String status = "Nao conectou...";
	private static Connection con = null;
	
	public ConexaoMySQL(){
		
	}
	
	public static Connection getConnectionMySQL(){
		
		String drivername = "com.mysql.jdbc.Driver";
		String servername = "localhost";	// Caminho do sevidor do BD
		String mydatabase = "minhabase";	// Nome do seu banco de dados
		String url = "jdbc:mysql://"+servername+":3306/"+mydatabase;
		String username = "root";	// Nome de um usuário de BD
		String password = "123456";	// Sua senha de acesso
		
		try {
			con = DriverManager.getConnection(url, username, password);
			
			if(con != null){
				status = "STATUS: Conectado com sucesso!";
			}else{
				status = "STATUS: Nao foi possivel realizar a conexao";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static boolean fecharConexao(){
		
		try {
			ConexaoMySQL.getConnectionMySQL().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(getConnectionMySQL());
		//System.out.println(ConexaoMySQL.status);
		ConexaoMySQL.getConnectionMySQL();
		ConexaoMySQL.fecharConexao();
		
		try {
			System.out.println(con.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
