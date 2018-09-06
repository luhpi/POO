package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.StarPlatinum;

public class CrazyDiamond {

	private Connection con = null;
	private String nome = null;
	
	public String consultaNome(int cod){
		con = StarPlatinum.getConnectionMySQL();
		String sql = "Select * from Empregado where codigo=?";
		
		try {
			PreparedStatement prepS = con.prepareStatement(sql);
			prepS.setInt(1, cod);
			ResultSet res = prepS.executeQuery();
			while(res.next())
				nome = res.getString(2);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return nome;
		
	}
	
	//inserir, atualizar, remover
	public String inserirNome(String nome){
		con = StarPlatinum.getConnectionMySQL();
		String myInsert = "INSERT INTO Empregado VALUES(null,?)";
		PreparedStatement prepStm = null;
		try {
			prepStm=con.prepareStatement(myInsert);
			prepStm.setString(1,nome);
			prepStm.executeUpdate(); 
			return "Inserção feita com sucesso";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Erro de inserção";
		}
		
	}
	
	public String atualizarNome(int cod, String nome){
		con = StarPlatinum.getConnectionMySQL();
		String sql = "Select * from Empregado where codigo=?";
		String myInsert = "INSERT INTO Empregado VALUES(?,?)";

			try {
				PreparedStatement prepStm=con.prepareStatement(myInsert);
				prepStm.setInt(1,cod);
				prepStm.setString(2,nome);
				prepStm.executeUpdate(); 
				return "Atualização feita com sucesso";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "Erro de atualização";
			}
			
	}
	
	void removerNome(int codigo){
		
	}
	
	public static void main(String[] args) {
		
		CrazyDiamond great = new CrazyDiamond();
	}
}
