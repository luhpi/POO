package a02;

public class Produtor extends Thread {
	
	private int quantidade;
	private Deposito deposito;
	
	public Produtor(int quant, Deposito dep){
		this.quantidade=quant;
		this.deposito=dep;}
	
	public void run(){
		System.out.println("Produtor [INICIO]");
		int total=0;
		
		for (int i = 0; i < quantidade; i++) {
			int valor=(int)(Math.random()*1234);
			try {
				deposito.armazenar(valor);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Produtor [OUT= "+valor+"]");
			total=total+valor;}
		System.out.println("Produtor [FIM total= "+total+"]");
	}
}
