package model;

public abstract class Pessoa {

	
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	
	

	abstract String imprimeDados();
	
	
}
