package atividade1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
	
	public static void main(String[] args) throws IOException {		
		for(int i = 0; i <= 1024; i++){
			available(i);
		}
	}
	
	
	private static void available(int port) {
	    System.out.println(">>Testando port " + port);
	    Socket s = null;
	    
	    try {
	        s = new Socket("localhost", port);
	        System.out.println("***Port " + port + " está aberto");
	        
	    } catch (IOException e) {
	        System.out.println("***Port " + port + " está fechado");
	   
	    } finally {
	        if( s != null){
	            try {
	                s.close();
	            } catch (IOException e) {
	                throw new RuntimeException("ERRO" , e);
	            }
	        }
	    }
	}
	
	
	
}