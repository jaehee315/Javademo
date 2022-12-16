package java005_method;

/*
 * [출력결과]
 * 10일때 => 10은 짝수입니다.
 * 9일때 => 9는 홀수입니다.
 */

public class Java059_method {

	public static void main(String[] args) {
		int data = 10;
//		if(process(data)) {
//			System.out.printf("%d는 짝수입니다.\n", data);
			
//		}else{
//			System.out.printf("%d는 홀수입니다.\n", data);
		
//		}		
		
//		string result = proces(data) ? "짝수" : "홀수";
//		System.out.printf("%d는 %s입니다.\n", data, result);
		
		System.out.printf("%d는 %s입니다.\n", data, process(data) ? "짝수" : "홀수");
		

	}//end main
	
	public static boolean process(int data) {
		//data매개변수의 값이 짝이면 참
		//홀수 이면 거짓 을 리턴하는 메소드 구현
		if(data % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}//end 

}//end class
