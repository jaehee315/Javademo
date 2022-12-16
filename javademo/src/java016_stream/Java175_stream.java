package java016_stream;

import java.io.File;

//Java171_stream
public class Java175_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//src/java016_stream/a/b 디렉토리에 아무거나 파일 2개 넣어 놓는다.
		File file = new File("src/java016_stream/a");
		deleteFileList(file);
	
	}
	
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles(); 
		
		System.out.println(fileAll.length);
		System.out.println(fileAll[0]);
		if(fileAll.length != 0)
			for(File file : fileAll) {
				System.out.println(file);
				if(file.isFile())
					file.delete();  // 파일 삭제 
				else
				deleteFileList(file);
			}
		System.out.println("Remove File :" + srcFile.getPath());
		srcFile.delete(); //디렉토리 삭제
	}

}
