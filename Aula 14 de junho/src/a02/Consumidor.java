package a02;

public class Consumidor extends Thread{
	
	private int quantidade;
	private Deposito deposito;

	
	public Consumidor(int quant, Deposito dep){
		this.quantidade=quant;
		this.deposito=dep;}
	
	public void run(){
		int total=0;
		
		System.out.println("Consumidor [INICIO]");
		
		for (int i = 0; i < quantidade; i++) {
			int valor = 0;
			try {
				valor = deposito.retirar();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Consumidor [IN= "+valor+"]");
			total=total+valor;}
		System.out.println("Consumidor [FIM= Total="+total+"]");
	}
}
