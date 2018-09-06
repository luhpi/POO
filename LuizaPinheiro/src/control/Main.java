package control;

import dao.ConexaoMySQL;
import vision.DialNO;
import vision.DialOK;
import vision.Tela;

public class Main {
	
	public static void main(String[] args) {
		ConexaoMySQL con = new ConexaoMySQL();
		con.getConexaoMySQL();
		Tela t = new Tela();
		t.setVisible(true);
		DialOK ok = new DialOK();
		DialNO no = new DialNO();
		Controle ctr = new Controle(t, ok, no);
	}
}
