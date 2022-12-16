package java005_method;
/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 * 
 */

public class Java053_method {

	public static void main(String[] args) {
		process("홍길동", true);
		save(30000);
		
	}//end main  //11
	
	//회원여부
	public static void process(String name, boolean chk) {
		if(chk) {
			System.out.printf("%s님은 회원입니다.\n", name);
		}else {
			System.out.printf("%s님은 비회원입니다.\n", name);
		}
	}//end process()  //6

	
	public static void save(int point) {
		System.out.printf("%d포인트가 적립되었습니다.\n", point); //9
	}//end save()  //10
	
}
