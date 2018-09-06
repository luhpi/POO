package atividade10;

public class ProdCons2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Deposito d= new Deposito();
		Produtor p= new Produtor(4, d);
		Consumidor c= new Consumidor(4,d);
		p.start();
		c.start();
	}
}
