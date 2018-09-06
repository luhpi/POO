package control;

import java.io.IOException;

import model.Cliente;
import vision.Visao;

public class MainBoi {
	
	public static void main(String[] args) throws IOException {
	
		Visao tela = new Visao();
		tela.getTxtCPF().setText("           ");
		Cliente c = new Cliente();
		tela.setVisible(true);
		ControlClient controle = new ControlClient(c, tela);
		
		
	}
}
