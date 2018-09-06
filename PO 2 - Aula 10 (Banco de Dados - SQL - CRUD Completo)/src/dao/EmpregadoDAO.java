package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpregadoDAO {

	private Connection con = null;
	private String nome = null;
	
	// Create
	public String insereNomeEmpregado(int codigo, String nome){
		con = ConexaoMySQL.getConnectionMySQL();
		String sql = "INSERT INTO Empregado VALUES (?, ?)";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setInt(1, codigo);
			prepS.setString(2, nome);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}
	
	// Read
	public String consultaNomeEmpregado(int codigo){
		con = ConexaoMySQL.getConnectionMySQL();
		String sql = "Select * from Empregado where codigo=?";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setInt(1, codigo);
			ResultSet res = prepS.executeQuery();
			while(res.next()){
				nome = res.getString(2);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return nome;
	}
	
	// Update
	public String atualizaNomeEmpregado(int codigo, String nome){
		con = ConexaoMySQL.getConnectionMySQL();
		String sql = "UPDATE Empregado SET nome=? WHERE codigo=?";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setString(1, nome);
			prepS.setInt(2, codigo);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	// Delete
	public String removeNomeEmpregado(int codigo){
		con = ConexaoMySQL.getConnectionMySQL();
		String sql = "DELETE FROM Empregado WHERE codigo=?";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setInt(1, codigo);
			prepS.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;

	}
	
	// Main
	public static void main(String[] args) {
		
		EmpregadoDAO emp = new EmpregadoDAO();
		System.out.println(emp.consultaNomeEmpregado(1));
	}

}
