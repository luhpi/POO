package atividade1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException{
		
		Socket connecc = null;
		String ip = "localhost";	// Fabrício: "200.132.125.55"; // Luiza: "200.132.125.90" // Henrique: 200.132.125.90
		int port = 2;
		
		connecc = new Socket(ip, port);
		messaging(connecc);
		
		connecc.close();
	}
	
	public static void messaging(Socket con) throws IOException{
		
		InputStream in;
		PrintWriter out;
		
		in = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader b = new BufferedReader(isr);
		out = new PrintWriter(con.getOutputStream());
		out.println("Teste");
		out.flush();
		out.close();
		con.close();
		
	}
}