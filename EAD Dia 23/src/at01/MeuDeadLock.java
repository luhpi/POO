package at01;

public class MeuDeadLock {
	
	String str1 = "ResourceA";
	String str2 = "ResourceB";
	
	Thread trd1 = new Thread("Thread X"){
		public void run(){
			int i = 0;
			while (i < 5){
				synchronized(str1){
					synchronized(str2){
						System.out.println(str1 + str2);
					}
				} i++;
			}
		}
	};
	
	Thread trd2 = new Thread("Thread Y"){
		public void run(){
			int i = 0;
			while (i < 5){
				synchronized(str1){
					synchronized(str2){
						System.out.println(str2 + str1);
					}
				} i++;
			}
		}
	};
		
	//simplesmente fazendo os dois esperarem pela mesma vari�vel no primeiro synchronized j� acaba com o deadlock
	//j� que s� quem tem a vari�vel pode pegar a segunda.
	
	public static void main(String[] args) {
		MeuDeadLock mdl = new MeuDeadLock();
		mdl.trd1.start();
		mdl.trd2.start();
	}
}
