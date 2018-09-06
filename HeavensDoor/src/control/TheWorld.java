package control;

import model.Worker;
import vision.LookAtMe;

public class TheWorld {

	public static void main(String[] args) {
		LookAtMe tela = new LookAtMe();
		tela.setVisible(true);
		Worker ant = new Worker();
		ControlWorker controle = new ControlWorker(tela, ant);
		
		
	}
}
