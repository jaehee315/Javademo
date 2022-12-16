package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Java163_stream {

	public static void main(String[] args) {
		//바이트 스트림
		InputStream is = System.in;
		
		InputStreamReader ir = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("데이터 입력:");
		
		
		try {
//		int data = br.read();
//		System.out.println(data);
//		System.err.println((char)data);

///////////////////////////////////////////////////////////////////////			
			
//			int data;
//			while((data=br.read())!=13)
//				System.out.println((char)data);
			
///////////////////////////////////////////////////////////////////////
			
			String line = br.readLine();
			System.out.println(line);
			
		}catch (IOException e) {
			e.printStackTrace();
		} finally {try {
			br.close();
			ir.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
			
		

		
		
		
		
	}//end

}
