package ex01;

public class fazTarefa extends Thread{

	 public int n;
	 public int time;

	 public fazTarefa(int n, int time) {
		super();
		this.n = n;
		this.time = time;
	}

	public void run(){
		 try {
			System.out.println(">>>>>>>>>>Iniciando tarefa "+ n);
			sleep(time);
			System.out.println(">>>>>>>>>>Finalizando tarefa "+ n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
}
