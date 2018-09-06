package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Empregado;
import dao.EmpregadoDAO;
import visao.TelaEmpregado;

public class EmpregadoControle implements ActionListener {

	private TelaEmpregado tela;
	private Empregado emp;
	
	public EmpregadoControle(TelaEmpregado t, Empregado e){
		super();
		this.tela = t;
		this.emp = e;
		this.tela.getBtnCriar().addActionListener(this);
		this.tela.getBtnConsultar().addActionListener(this);
		this.tela.getBtnAtualizar().addActionListener(this);
		this.tela.getBtnDeletar().addActionListener(this);
	}
	
	// Create
	public void inserirNome(){
		EmpregadoDAO empDAO = new EmpregadoDAO();
		String nome = empDAO.insereNomeEmpregado(emp.getCodigo(), emp.getNome());
	}
	
	// Read
	public String consultarNome(Empregado e){
		EmpregadoDAO empDAO = new EmpregadoDAO();
		String nome = empDAO.consultaNomeEmpregado(e.getCodigo());
		return nome;
	}
	
	// Update
	public void atualizarNome(){
		EmpregadoDAO empDAO = new EmpregadoDAO();
		String nome = empDAO.atualizaNomeEmpregado(emp.getCodigo(), emp.getNome());
	}
	
	// Delete
	public String deletarNome(Empregado e){
		EmpregadoDAO empDAO = new EmpregadoDAO();
		String nome = empDAO.removeNomeEmpregado(e.getCodigo());
		return nome;
	}
	
	// Controle dos JButtons
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Criar")){
			this.emp.setCodigo(Integer.parseInt(this.tela.getFieldCodigoCreate().getText()));
			this.emp.setNome(this.tela.getFieldNomeCreate().getText());
			inserirNome();
		}
		
		if(e.getActionCommand().equals("Consultar")){
			this.emp.setCodigo(Integer.parseInt(this.tela.getFieldCodigoRead().getText()));
			this.tela.getLblNomeEmpregado().setText(consultarNome(this.emp));
		}
		
		if(e.getActionCommand().equals("Atualizar")){
			this.emp.setCodigo(Integer.parseInt(this.tela.getFieldCodigoUpdate().getText()));
			this.emp.setNome(this.tela.getFieldNomeUpdate().getText());
			atualizarNome();
		}
		
		if(e.getActionCommand().equals("Deletar")){
			this.emp.setCodigo(Integer.parseInt(this.tela.getFieldCodigoDelete().getText()));
			this.tela.getLblNomeDeletado().setText(consultarNome(this.emp)+" is gone!");
			deletarNome(this.emp);
		}
	
	}

}
