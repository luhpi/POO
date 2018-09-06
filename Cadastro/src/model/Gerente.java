package model;

public class Gerente extends Pessoa{

	protected double salario;
	
	public Gerente(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

	@Override
	public String imprimeDados() {
		double imposto = calculaImposto(salario);
		return "Nome: " + nome + "/nIdade: " + idade + "/nSalario " + salario + "/nImposto: " + imposto;		
	}

	public double calculaImposto(double salario) {
		return (salario * 0.05);
	} 



}
