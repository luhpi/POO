package lotor_is_evil;

public class t3 extends Thread{
	
	void fazTarefa3(){
		System.out.println("Fazendo tarefa 3...");
	}
	
	
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fazTarefa3();
	}

}
