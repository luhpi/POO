package lotor_is_evil;

public class ClassePrincipal {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.nanoTime();
		
		
		t1 tum = new t1();
		t2 tdois = new t2();
		t3 ttres = new t3();
		t4 tquatro = new t4();
		
		tum.start();
		tdois.start();
		tdois.join();
		ttres.start();
		ttres.join();	
		tquatro.start();
		tquatro.join();
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		totalTime = totalTime /100000000;
		System.out.println(totalTime + " segundos de execução");
		
	}
	
}
