package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java173_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/java016_stream/test.txt");
		
		if(!file.exists()) {
			try {
				file.createNewFile(); //파일생성
				System.out.println("test.txt 파일 생성");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("program end");
	}

}
