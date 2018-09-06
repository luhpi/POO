package ex01;

public class mainBoy {

	public static void main(String[] args) throws InterruptedException {
		fazTarefa t1 = new fazTarefa(1, 42000);
		fazTarefa t2 = new fazTarefa(2, 16000);
		fazTarefa t3 = new fazTarefa(3, 8000);
		fazTarefa t4 = new fazTarefa(4, 28000);
		fazTarefa t5 = new fazTarefa(1, 25000);
		timer t = new timer();
		
		t.start();
		t2.start();
		t1.start();
		t1.join();
		t5.start();
		t3.start();
		t4.start();


	}
}
