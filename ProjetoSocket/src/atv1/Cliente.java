package atv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

	

public class Cliente {
	

	public static void main(String[] args) throws IOException {
		InputStream in;
		OutputStream out;
		Socket cliente = null;
		int port = 3207;
		String IP = "200.132.125.67";
		try{
			cliente = new Socket(IP, port);
			in = cliente.getInputStream();
			out = cliente.getOutputStream();
			fornecerServico(cliente, IP);
		} catch (IOException e){
			e.printStackTrace();
		}
		try {
			cliente.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	
	public static void fornecerServico(Socket con,String ip) throws IOException{
		InputStream in;
		PrintWriter out;
		System.out.println("Fornecendo serviço");
			
			in = con.getInputStream();
			InputStreamReader insr = new InputStreamReader(in);
			BufferedReader buffin = new BufferedReader(insr);
			out = new PrintWriter(con.getOutputStream());

			
			while(!buffin.ready());
			
			while(buffin.ready()){		
				if(buffin.ready()){
				System.out.println("Message recieved");		
				System.out.println(buffin.readLine()+"< Essa foi a mensagem");
				}else{
					System.out.println("Waiting message");
				}
			}
			
			in.close();
			con.close();

	}

}
