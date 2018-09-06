package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMySQL {
	public static String status = "N�o conectou...";

	public ConexaoMySQL()
	{}

	public static Connection getConexaoMySQL(){
		Connection connection = null; 
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			String serverName = "localhost"; 
			String mydatabase ="myspace"; 
			String url = "jdbc:mysql://"+serverName+":3306/"+ mydatabase;
			String username = "root";  
			String password = "123456"; 
			connection = DriverManager.getConnection(url, username, password);
			
			
			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			}
			else {
				status = ("STATUS--->N�o foi possivel realizar conex�o");
			}
			return connection;
			
		}
	    catch (ClassNotFoundException e) { 
	    	 System.out.println("O driver expecificado nao foi encontrado.");
	    	 return null;
	    }
	    catch (SQLException e) {
	    	System.out.println("Nao foi possivel conectar ao Banco de Dados.");

	    	return null;
	    }

	}

	public static String statusConection() {
		return status;
	}

	public static boolean FecharConexao() {

		try {

			ConexaoMySQL.getConexaoMySQL().close();

			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public static Connection ReiniciarConexao() {
		FecharConexao();
		return ConexaoMySQL.getConexaoMySQL();
	}
	
	public static void main(String[] args) {
		getConexaoMySQL();
	}

}