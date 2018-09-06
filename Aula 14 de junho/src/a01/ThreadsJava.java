package a01;

public class ThreadsJava {
	
	public static void main(String[] args){
		Compartilhado s= new Compartilhado();

		
		ThreadA t1 = new ThreadA(s);
		ThreadA t2 = new ThreadA(s);
		
		t1.start();
		t2.start();
	 }


}
