package atividade10;

public class Deposito {
	
	private int valor;
	private boolean flag=false;
	
	synchronized public void armazenar(int val)
	{
		while(flag==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.valor=val;
		flag=true;
		notify();
	}
	synchronized public int retirar()
	{		
		while(flag==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		flag=false;
		notify();
		return valor;
	}
}
