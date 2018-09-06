package five;

import javax.swing.JLabel;

public class Counter extends Thread{
	
	static long startTime;
	static long endTime;
	static float totalTime;
	public JLabel j;
	public int time;
	public JLabel dog;
	private volatile boolean runnable;
	
	
	
	public Counter(JLabel j, JLabel dog, int time) {
		super();
		this.j = j;
		this.dog = dog;
		this.time = time;
	}

	public void run(){
		this.runnable = true;
		
		try {
			sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		this.runnable = true;
		
		double count = 0;
		int cnt = 0;
		while(this.runnable){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();

				
			}
			cnt++;
			count = (double)cnt/10;
			
			j.setText("<html>delay = " + Integer.toString(time) + "<br /> <center>" + Double.toString(count) + "<center> <html>");
			if(count == 41.3){
				dog.setVisible(true);
			}else{
				dog.setVisible(false);
			}
		}
		

		
		
	}
	
	public void Count(JLabel j, JLabel dog, int time){
		
	}
	
	public void clean(){
		j.setText("0.0");
	}
	

}
