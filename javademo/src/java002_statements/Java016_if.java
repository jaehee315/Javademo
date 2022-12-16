package java002_statements;

/*
 * 제어문: 문장의 흐름을 제어해주는 기능
 * 1. 종류
 * 		조건문: if~else, swith~case
 * 		반복문 : for do while
 * 		기타 : break continue label
 * 
 * 		if(조건식){
 *			조건식이 참일 때; 
 * 		}else{
 * 			조건식이 거짓일 때; 
 * 		}
 * 
 */

public class Java016_if {
	
	public static void main(String[] args) {
		
		int num = 4;
		if(num % 2 == 0){
		System.out.printf("%d는 짝수.\n", num);
		}else{
		System.out.printf("%d는 홀수.\n", num);
		}
	
	}

}
