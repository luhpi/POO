package model;

public class Funcionario extends Pessoa{

	protected double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}	

	public String imprimeDados() {
		double imposto = calculaImposto(salario);
		return "Nome: " + nome + "/nIdade: " + idade + "/nSalario " + salario + "/nImposto: " + imposto;		
	}

	public double calculaImposto(double salario) {
		return (salario * 0.03);
	} 

	
	
	
}
