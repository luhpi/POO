package lotor_is_evil;

public class t2 extends Thread{
	
	void avalia(){
		System.out.println("Avaliando...");
	}
	
	
	public void run() {
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		avalia();
	}
}
