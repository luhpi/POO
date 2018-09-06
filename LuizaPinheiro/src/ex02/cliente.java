package ex02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class cliente {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Socket con = null;
		int port = 3333;
		String ip = "localhost";
		
		while(true){
			try {
				con = new Socket(ip, port);
				con.connect(con.getRemoteSocketAddress());
				enviaMsg(con, "kkk eae men");
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

	public static void enviaMsg(Socket con, String s) throws IOException {
		PrintWriter pw = new PrintWriter(con.getOutputStream());
		BufferedWriter bf = new BufferedWriter(pw);
		bf.write(s);
		bf.flush();
		bf.flush();
		bf.close();
		pw.close();
		
	}
}
