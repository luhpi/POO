package a01;

public class Compartilhado{
	int i;
	
	void MetodoCompartilhado(){
		i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i = 30;
		System.out.println(i);

		for (int j = 0; j < 5; j++) {
			i=i+j;
			}
		
		System.out.println("total: "+i);
 }
}
