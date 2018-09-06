package a01;

public class ThreadA extends Thread{
	private Compartilhado s1;
	
	public ThreadA(Compartilhado s){
		this.s1=s;
		}

	public void run(){
		s1.MetodoCompartilhado();
	}
	
	
	
	
	
}
