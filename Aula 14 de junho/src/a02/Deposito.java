package a02;

public class Deposito {
	
	private int valor;
	boolean flag = false;
	
	public synchronized void armazenar(int valor) throws InterruptedException
	{
		while (flag == true){
			wait();
		}
		this.valor=valor;
		flag = true;
		notifyAll();
	}
	public synchronized int retirar() throws InterruptedException
	{		
		while(flag == false){
			wait();
		}
		flag = false;
		notifyAll();
		return valor;
	}
}
