package guretodaze;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import yareyaredaze.StarPlatinum;

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
	
	public static void main(String[] args) {
		
		CrazyDiamond great = new CrazyDiamond();
		System.out.println(great.consultaNome(1));
	}
}
