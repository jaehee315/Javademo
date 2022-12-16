package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java167_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("sample.txt");
		FileReader fr = null;
		int data;
		
		try {
			fr = new FileReader(file);
//			for(long i = 0; i<file.length(); i++) {
//				// 기본값은 유니코드값으로 나옴 ->(char)로 형변환 필요
//				System.out.print((char)fr.read()); 
//			}
			//read() :파일 끝일 때 -1을 리턴한다.
			while((data= fr.read())!= -1) {
				System.out.print((char)data); 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(fr != null)
					fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		///////////////////////////////////////////////
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); //대상이 file일때는 예외처리 해야함.
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(sc != null)
				sc.close();
		}
		}

}
