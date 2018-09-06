package five;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manipulador implements ActionListener{

	public View t;
	
	
	
	public Manipulador(View t) {
		super();
		this.t = t;
		this.t.getBtnStopPls().addActionListener(this);
		this.t.getBtnStart().addActionListener(this);
	}


	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		Counter c1 = new Counter(t.getLblA1(), t.getDog(), 0);
		Counter c2 = new Counter(t.getLblA2(), t.getDog(), 500);
		Counter c3 = new Counter(t.getLblA3(), t.getDog(), 160);
		Counter c4 = new Counter(t.getLblB1(), t.getDog(), 50);
		Counter c5 = new Counter(t.getLblB2(), t.getDog(), 900);
		Counter c6 = new Counter(t.getLblB3(), t.getDog(), 800);
		Counter c7 = new Counter(t.getLblC1(), t.getDog(), 200);
		Counter c8 = new Counter(t.getLblC2(), t.getDog(), 1500);
		Counter c9 = new Counter(t.getLblC3(), t.getDog(), 0);
		
		if(e.getActionCommand().equals("start")){
			t.getBtnStopPls().setText("stop pls");
			c1.start();
			c2.start();
			c3.start();
			c4.start();
			c5.start();
			c6.start();
			c7.start();
			c8.start();
			c9.start();		
		
		}if(e.getActionCommand().equals("stop pls")){
			
			Sorry s = new Sorry(t);
			s.start();

			
			
			
		}
		
	}
	
}
