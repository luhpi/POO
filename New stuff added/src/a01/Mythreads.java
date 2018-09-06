package a01;

public class Mythreads extends Thread{

	private String nome;
	
	public Mythreads(String h){
		this.nome = h;
	}
	
	public void run(){
		System.out.println("Testando thread...");
	}
	
	public static void main(String[] args) {
		Mythreads mt = new Mythreads("T1");
		Thread mt2 = new Thread(new Mythread());
		mt.start();
		mt2.start();
		System.out.println("Testando main...");
	}
}
