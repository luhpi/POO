package controle;

import modelo.Empregado;
import visao.TelaEmpregado;

public class App {

	public static void main(String[] args) {
		
		TelaEmpregado tela = new TelaEmpregado();
		tela.setVisible(true);
		Empregado em = new Empregado();
		EmpregadoControle empC = new EmpregadoControle(tela, em);
	}

}
