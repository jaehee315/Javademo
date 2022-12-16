package java003_statements;
/*
 * 1~10까지 짝수, 홀수 누적을 계산하는 프로그램
 * 
 * [출력결과]
 * 홀:25
 * 짝:30
 * 
 */
public class Java029_for {
	
	public static void main(String[] args) {
		int odd = 0; //홀
		int even = 0; //짝
		
		for (int i = 1; i <=10; i++) {
			if(i % 2 == 0) {             //if(i%2==1)
				even = even + i;         //odd = odd +i;
			}else {                      //else
				odd= odd + i;            //even = even + i;
			}						

		}
		
		System.out.printf("홀수 누적:%d\n", odd);
		System.out.printf("짝수 누적:%d\n", even);
		
		
		
	}//end

}
