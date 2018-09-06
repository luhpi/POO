package ex02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class server {
	
	
	public static void main(String[] args) {
		ServerSocket con = null;
		int port = 3333;
		
		while(true){
			try {
				con = new ServerSocket(port);
				con.accept();
				if(con.isBound()){
					System.out.println("accepted");
					
				}
				con.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	
}
