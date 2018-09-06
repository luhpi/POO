package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vision.DialNO;
import vision.DialOK;
import vision.Tela;

public class Controle implements ActionListener{

	public Tela t;
	public DialOK no;
	public DialNO ok;
	
	public Controle(Tela t,DialOK no, DialNO ok) {
		super();
		this.t = t;
		this.no = no;
		this.ok = ok;
		this.t.getBtnLimpar().addActionListener(this);
		this.t.getBtnLogar().addActionListener(this);

	}
	
	private void fazerLogin() {
		if((t.getFieldNome().getText().equals("visitante"))&&(t.getFieldSenha().getText().equals("visitante"))){
			this.ok.setVisible(true);
		} else {
			this.no.setVisible(true);
		}
	}
	public void limparTela() {
		t.getFieldNome().setText("");
		t.getFieldSenha().setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Limpar")){
			this.limparTela();
		}
		if(e.getActionCommand().equals("Logar")){
			System.out.println(t.getFieldNome().getText() + " " + t.getFieldSenha().getText());
			this.fazerLogin();
		}
	}

	



	
	

}
