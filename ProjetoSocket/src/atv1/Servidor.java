package atv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(3207);
		InputStream in;
		OutputStream out;
		Socket cliente = null;
		int port = 3207;
		String IP = "200.132.125.67";
		
		try{
			cliente = new Socket(IP, port);
			in = cliente.getInputStream();
			out = cliente.getOutputStream();
			System.out.println("Servidor aguardando por conexao...");
			Socket conexao = ss.accept();
			System.out.println("Recebida Conexao de: "+conexao.getInetAddress());
			enviaMsg(cliente);
		} catch (IOException e){
			e.printStackTrace();
		}
		try {
			cliente.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
	

	public static void enviaMsg(Socket cli) throws IOException {
		InputStream in;
		PrintWriter out;

		in=cli.getInputStream();
		InputStreamReader r = new InputStreamReader(in);
		BufferedReader b = new BufferedReader(r);
		out = new PrintWriter(cli.getOutputStream());
		
		out.println("uu: HAVE THEM EXECuTE THE HuMAN MANEuVER YOu CALL.");
		out.println("uu: 'THE HuG.'");
		
		
		
		out.flush();
		out.close();
		out.close();
		
	}
	
	
}
