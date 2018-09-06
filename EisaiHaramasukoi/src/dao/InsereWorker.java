package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnectionSQL;
import model.Cliente;

public class InsereWorker {

	private Connection con = null;
	private Cliente cli = null;
	
	public String inserirNome(Cliente cli){
		con = ConnectionSQL.getConnectionMySQL();
		String myInsert = "INSERT INTO cliente VALUES(?,?,?,?,?)";
		PreparedStatement prepStm = null;
		try {
			prepStm=con.prepareStatement(myInsert);
			prepStm.setString(1,cli.getCpf());
			prepStm.setString(2,cli.getNome());
			prepStm.setString(3,cli.getEndereco());
			prepStm.setString(1,Character.toString(cli.getSexo()));
			prepStm.setString(1,cli.getProfissao());
			prepStm.executeUpdate(); 
			return "Inserção feita com sucesso";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Erro de inserção";
		}
		
	}
	
}
