package atividade1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static int sair = 0;
	
	public static void main(String[] args) throws IOException {
		ServerSocket se = new ServerSocket(3207);
		
		while(sair == 0){
			System.out.println("============================\n>>Server awaiting connection...");
			Socket socketCliente = se.accept();
			System.out.println(">>Connection recieved from: "+socketCliente.getInetAddress().toString());
			System.out.println(">>Recieving message: ");
			recieveMsg(socketCliente);
		}
	}
	
	// TODO: Add message sending method
	
	public static void recieveMsg(Socket cli) throws IOException{
		
		InputStream in = null;
		PrintWriter out = null;
		String line;
		in = cli.getInputStream();
		InputStreamReader insr = new InputStreamReader(in);
		BufferedReader buffin = new BufferedReader(insr);
		
		out = new PrintWriter(cli.getOutputStream());
		
		while(!buffin.ready() == true);
		
		
			if(buffin.ready()){
				System.out.println(">>Message recieved!");
				line = buffin.readLine();
				if(line.equalsIgnoreCase("sair")){
					System.out.println(">>Saindo...");
					sair = 1;
				}else{
					if(line.equalsIgnoreCase("laurel"))
						System.out.println("Yanny");
					else if(line.equalsIgnoreCase("yanny"))
						System.out.println("Laurel");
					else if(line.equalsIgnoreCase("all might na veia"))
						System.out.println("endeavor na cadeia!");
					else
						System.out.println(line);
				}
			}else{
				System.out.println("Awaiting message...");
			
		
		}
		in.close();
		cli.close();
	}
	
}