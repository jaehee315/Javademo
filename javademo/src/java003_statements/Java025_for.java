package java003_statements;

public class Java025_for {
	
	public static void main(String[] args) {
		//누적된 값이 최초로 1이상 일때만 반복문 수행
		
		int sum = 0;
		int i;
		
		for(i=1; ;i++) {
			sum = sum + i;
			if(sum>=15) {
				break;
			}
		}
		
		System.out.printf("i=%d sum=%d\n", i, sum);
		
		
	}

}
