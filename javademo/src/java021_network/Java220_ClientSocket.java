package java021_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


/*
 * Socket
 */

public class Java220_ClientSocket {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			
			//3  서버연결 요청       ("서버주소", 7777)
			socket = new Socket("127.0.0.1", 7777);
			
			
			   OutputStream os = socket.getOutputStream();
			   OutputStreamWriter ow = new OutputStreamWriter(os);
			   
			   InputStream is = socket.getInputStream();
			   InputStreamReader ir = new InputStreamReader(is);
			   BufferedReader br = new BufferedReader(ir);
			   
			   ow.write("클라이언트에게 정보를 보냄");
			   ow.flush();
			   ow.close();
			   
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
