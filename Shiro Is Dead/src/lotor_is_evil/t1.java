package lotor_is_evil;

public class t1 extends Thread{
	
	void fazTarefa1(){
		System.out.println("Fazendo tarefa 1...");
	}
	
	void fazTarefa2(){
		System.out.println("Fazendo tarefa 2...");
	}
	
	
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fazTarefa1();
		try {
			sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fazTarefa2();
	}

}
