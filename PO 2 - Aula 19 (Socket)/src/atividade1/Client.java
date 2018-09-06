package atividade1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws IOException{
		String conf, msg;
		Scanner scan = new Scanner(System.in); 
		Socket connecc = null;
		String ip = "localhost";	//Henrique: 200.132.125.67 // Fabrício: "200.132.125.55"; // Luiza: "200.132.125.90";
		int port = 3207;
		
		
		do{
			connecc = new Socket(ip, port);
			System.out.print("Insira a frase a ser enviada: ");
			msg = scan.nextLine();
			messaging(connecc, msg);
			connecc.close();
		}while(!msg.equalsIgnoreCase("sair"));
		

	}
	
	public static void messaging(Socket con, String s) throws IOException{
		
		InputStream in;
		PrintWriter out;
		
		in = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader b = new BufferedReader(isr);
		out = new PrintWriter(con.getOutputStream());
		out.println(s);
		out.flush();
		out.close();
		con.close();
		
	}
}