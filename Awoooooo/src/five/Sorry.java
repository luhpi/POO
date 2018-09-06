package five;

public class Sorry extends Thread{
	
	View t;
	
	public Sorry(View t) {
		super();
		this.t = t;
		
	}
	
	public void run(){
		t.getLabel().setVisible(true);
		
		try {
			sleep(50000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t.getLabel().setVisible(false);

	}
	
}
