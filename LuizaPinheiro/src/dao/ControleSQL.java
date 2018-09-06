package dao;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class ControleSQL {

	private ConexaoMySQL con;

	public ControleSQL(ConexaoMySQL con) {
		super();
		this.con = con;
	}
	
	public boolean searchUser(String nome, String senha){
		boolean status = false;
		String state = "Select * from AUTENTICA where usuario=? AND senha=?";
		
		PreparedStatement prep = null;
		try {
			prep.execute(state);
			prep.setString(1, nome);
			prep.setString(2, senha);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
