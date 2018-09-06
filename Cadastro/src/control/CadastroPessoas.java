package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Pessoa;
import vision.Cadastro;
import vision.TelaCadastro;

public class CadastroPessoas implements ActionListener{
	
	ArrayList<Pessoa> CAD = new ArrayList<Pessoa>();
	TelaCadastro tc;
	Cadastro cp;
	
	public CadastroPessoas(TelaCadastro t) {
		super();
		this.tc = t;
	}

	
	public void CadastraPessoa(Pessoa p){
		CAD.add(p);
	}

	public void ImprimeCadastro(){
		cp.setVisible(true);
		for(Pessoa p:CAD){
			//this.cp.txtCadastro.setText(p.imprimeDados); *why won't you work???*
		}
	}
	
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
		public static void main(String[] args) {
			TelaCadastro t = new TelaCadastro();
			t.setVisible(true);
			CadastroPessoas cp = new CadastroPessoas(t);
			
		}
	
}
