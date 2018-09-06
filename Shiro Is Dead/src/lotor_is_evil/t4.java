package lotor_is_evil;

public class t4 extends Thread {
	
	void finaliza(){
		System.out.println("Finalizando...");
	}
	
	
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finaliza();
	}

}
