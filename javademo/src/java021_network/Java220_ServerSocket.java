package java021_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class Java220_ServerSocket {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			//1. port번호를 지정해서 서버소켓 생성
			server = new ServerSocket(7777);
			
			
			//2.클라이언 요청이 들어올땓까지 대기
			System.out.println("대기: ");
			Socket socket  = server.accept();
			System.out.println(socket.getInetAddress());
			
		   OutputStream os = socket.getOutputStream();
		   OutputStreamWriter ow = new OutputStreamWriter(os);
		   
		   InputStream is = socket.getInputStream();
		   InputStreamReader ir = new InputStreamReader(is);
		   BufferedReader br = new BufferedReader(ir);
		   
		   System.out.println(br.readLine());
		   br.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
