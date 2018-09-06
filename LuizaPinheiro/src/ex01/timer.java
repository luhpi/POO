package ex01;

public class timer extends Thread{
	int count = 0;
	public void run(){
		while(true){
			try {
				sleep(1000);
				count++;
				System.out.println("Se passaram "+ count +" segundos...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
