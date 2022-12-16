package java001_basic;

public class Java006_operators {
	
	/*
	 * 연산자(operator) : 어떠한 기능을 수행하는 기호(+ - = > < => =< == != ...)
	 * 피연산자(operand) : 연산자의 작업 대상 (변수 상수 리터널 수식)
	 * 
	 * 연산자의 종류 
	 * 1. 산술연산자 : +,  -,  *,  /, %
	 * 2. 비교연산자(이항연산자) : > <
	 * 3. 논리연산자(이항연산자) :くニ != && (and), lI(or), ! (not)
	 * 4. 조건연산자(삼항연산자) : 조건식 ? 참 : 거짓
	 * 5. 대입연산자(이항연산자) : =, +, 0=, *ニ, 13 *. /=, ...
	 * 6. 증감연산자(단항연산자) : ++(1씩 증가) , --(1씩 감소)
	 * 
	 */
	
	
	public static void main(String[] args) {
		int numX = 10;
		int numY = 5;
		
		//int = int + int
		int res = numX + numY;
		System.out.println(res);
		
		double avg = 4.5;
		double val = numX + avg;
		System.out.println(val);
		
		short a = 3;
		short b = 4;
		
		int c = a + b;
		System.out.println(c);
		
		/*
		 * int = short + short
		 * int = byte + bute
		 * int = short + short
		 * int = byte + byte
		 * int = int + byte
		 */
		
		//자바에서 유니코드를 사용을 한다.
		char data = '0';
		char alpa = 'A';
		int sum = data + alpa;
		System.out.println(sum);
		
		
		
	}//end main()

}// end class
