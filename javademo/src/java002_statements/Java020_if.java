package java002_statements;
/*
 * data변수에 저장된 값이 대문자이면"대문자 입니다.", 소문자이면"소문자 입니다."
 * 그 외는 "기타입니다."로 출력하는 플그램을 구현하세요.
 * 
 * 
 */

public class Java020_if {
	
	public static void main(String[] args) {
		
		char data = 'd';
		
		//'A' <= data ,= 'z' (수학)
		//data >='A' && data<='Z' (프로그램)
		
		if (data >= 'A' && data <= 'Z') {
			System.out.printf("%c는 대문자입니다.\n", data);
		} else if (data >= 'a' && data <= 'z') {
			System.out.printf("%c는 소문자입니다.\n", data);
		}
	
	}
}
