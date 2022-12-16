package java016_stream;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 순번:10
 * 이름: 홍길동
 * 평균:9.5
 */

public class Java165_stream {

	public static void main(String[] args) {
		System.out.println("[순번  이름  평균]입력: ");
		
		Scanner sc = new Scanner(System.in);
		int num;
		String name;
		double avg;
		boolean chk = true;
		
		while  (true){
			System.out.println("[순번  이름  평균]입력: ");
		try {
		num = sc.nextInt(); //순번
		name = sc.next(); //이름
		avg = sc.nextDouble(); //평균
		
				
		System.out.printf("순번:%d\n", num);
		System.out.printf("이름:%s\n", name);
		System.out.printf("평균:%.1f\n", avg);
//		if(chk)
			break;
		}catch(InputMismatchException ex) {
//			System.out.println(ex.toString());
//			System.out.println(sc.next());  
//			System.out.println(sc.next());  
//			System.out.println(sc.next());  
			
//			sc.next();  
//			sc.next();  
//			sc.next();
			
			sc.nextLine();
					
		}
		
	}	
		sc.close();
	}//end

}
