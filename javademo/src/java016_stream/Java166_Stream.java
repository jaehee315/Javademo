package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("sample.txt");
		System.out.println(file.exists()); // false
		System.out.println(file.isFile()); // false
		System.out.println(file.length()); // 0

		FileWriter fw = null;
		
		try {
			//2번째 인자는 mode값이며, 생략 시 기본값은 false(update)
			// mode값이 false이면 append이다.
			// true로 하면 기존 write 내용 추가됨..
			fw = new FileWriter(file, false); 
			fw.write("java\n"); // Buffer에 쓰는 것
			// buffer에 저장된 데이터를 sample.txt파일로 보내고 buffer을 비운다.
			fw.flush(); 
			fw.write("jsp\n");
			fw.flush();
			fw.write(new char[] {'s', 'p', 'r', 'i', 'n', 'g'});
			fw.write("\n");
			fw.flush();
			fw.write(97); //유니코드 'a'
			fw.write("\n");
			fw.flush();
			//(char[] int offset, int len)
			fw.write(new char[] {'s', 'p', 'r', 'i', 'n', 'g'}, 0, 3);
			fw.write("\n");
			fw.close();//buffer -> flush -> close
//			fw.write("mybatis");
//			fw.write("\n");
//			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
