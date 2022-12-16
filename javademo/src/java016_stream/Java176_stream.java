package java016_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *직렬화(serializable) 
 *1. 객체를 연속적인 데이터로 변환하는 것이다. 
 *	 반대로는 역직렬화이다.
 *2. 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.
 *3. 객체를 저장하기 위해서는 객체를 직렬화 해야 한다.
 *4. 객체를 저장한다는 것은 객체의 멤버변수의 값을 저장한다는 것이다.
 *5. 객체를 직렬화하여 입출력할 수 있는 스트림
 *	 ObjectInputStream, ObjectOutputStream
 *6. 직렬화에서 제외할 멤버변수에서는 transient를 선언한다.
 */
public class Java176_stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/java016_stream/phone.dat");
		FileOutputStream fo = null;
		FileInputStream fi = null;
		
		ObjectOutputStream os = null;
		ObjectInputStream oi = null;
		
		try {
			fo = new FileOutputStream(file);
			os = new ObjectOutputStream(fo);
			//객체에 직렬화가 안되어 있으면 Exception이 발생한다.
			Phone p = new Phone("android", 5000);
			os.writeObject(p); //Object업캐스팅되어 저장됨
			
			String s = new String("java");
			os.writeObject(s);
			
			System.out.println("객체저장");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			os.close();
			fo.close();
		}
		/////////////////////////////////////////////////////
		fi = new FileInputStream(file);
		oi = new ObjectInputStream(fi);
		try {
			//다운캐스팅하여 불러와야하며 저장된 순서의 역으로 불러야 함
			Phone p = (Phone) oi.readObject(); 
			System.out.println(p);
			
			String s = (String) oi.readObject();
			System.out.println(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			oi.close();
			fi.close();
		}
		
		
			
	}

}
