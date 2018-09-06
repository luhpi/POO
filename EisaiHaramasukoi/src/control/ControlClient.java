package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Cliente;
import vision.Visao;

public class ControlClient implements ActionListener{

	private Cliente c;
	private Visao tela;
	
	public ControlClient(Cliente c, Visao tela) {
		super();
		this.c = c;
		this.tela = tela;
		this.tela.getBtnGravar().addActionListener(this);
		this.tela.getBtnLimpar().addActionListener(this);
	}

	public void limpar(){
		tela.getTxtCPF().setText("");
		tela.getTxtEndereco().setText("");
		tela.getTxtNome().setText("");
		tela.getGrupo().clearSelection();
	
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Limpar")){
			limpar();
		}
		if(e.getActionCommand().equals("Gravar")){
			if(tela.getTxtCPF().getText().length() >= 11)
				c.setCpf(tela.getTxtCPF().getText().substring(0, 11));
			else
				tela.getTxtCPF().setText("INSIRA UM CPF VÁLIDO");
			c.setNome(tela.getTxtNome().getText());
			c.setSexo(tela.getGrupo().getSelection().getActionCommand().charAt(0));
			System.out.println(c.sexo);
		}
		
	}
	
	
	
	
}
