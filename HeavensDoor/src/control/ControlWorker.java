package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.CrazyDiamond;
import model.Worker;
import vision.LookAtMe;

public class ControlWorker implements ActionListener {

	private LookAtMe tela;
	private Worker emp;
	
	public ControlWorker(LookAtMe t, Worker e) {
		super();
		this.tela = t;
		this.emp = e;
		this.tela.getBtnPesquisar().addActionListener(this);
		this.tela.getBtnInserir().addActionListener(this);
		this.tela.getBtnAtualizar().addActionListener(this);
		this.tela.getBtnRemover().addActionListener(this);

	}

	public String consultaNome(Worker w){
		CrazyDiamond empD = new CrazyDiamond();
		String nome = empD.consultaNome(w.getCodigo());
		return nome;
	}
	
	public String insereEmp(String nome){
		CrazyDiamond empD = new CrazyDiamond();
		String resultado = empD.inserirNome(nome);
		return resultado;
	}
	public String atualizaNome(Worker w) {
		CrazyDiamond empD = new CrazyDiamond();
		String resultado = empD.atualizarNome(w.getCodigo(), w.getNome());
		return resultado;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Pesquisar")){
			this.emp.setCodigo(Integer.parseInt(this.tela.getpCodigo().getText()));
			this.tela.getpResultado().setText(consultaNome(this.emp));
		}
		if(e.getActionCommand().equals("Inserir")){
			this.emp.setNome(this.tela.getiNome().getText());
			this.tela.getiResultado().setText(insereEmp(this.emp.getNome()));
		}
		if(e.getActionCommand().equals("Atualizar")){
			this.emp.setNome(this.tela.getaNome().getText());
			this.emp.setCodigo(Integer.parseInt(this.tela.getaCodigo().getText()));
			this.tela.getpResultado().setText(atualizaNome(this.emp));
		}

	}

	
	
	
}
