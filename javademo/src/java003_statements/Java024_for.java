package java003_statements;
/*
 * for(초기식; 조건식; 증감식){
 * 	반복문 수행할 문장;
 * }
 * 
 * 1.조건식이 true 일때만 반복을 실행한다.
 * 2. for문 실행순서
 * 		초기식 -> 조건식(참) -> 반복수행
 * 			-> 조건식 -> 반복수행 -> 증감식
 * 			-> 조건식 -> 반복수행 -> 증감식
 * 			...........
 * 			-> 조선식 -> for문을 종료
 * 3. 초기식은 한번만 수행함.
 * 4. c초기식, 조건식, 증감식은 생략가능     for(;;)는 ;; 생략 x
 * 5. 조기식, 증감식은 여러개 사용 가능, 조건식은 한개만 가능
 * 6. 조건식을 생략하면 참으로 처리
 * 		for문을 종료 시점을 정확히 파악할 수 없을때 for문의 조건식 생략
 * 
 * //초기화식 생략
		int i=0;
		for(;i<10;i++){
    	printf("%d\n",i);
		}

	//조건식 생략(무한루프에 빠지게됩니다.)
		for(int i=0;;i++){
    	printf("%d\n",i);
		}

	//증감식 생략(무한루프에 빠지게됩니다.)
		for(int i=0;i<10;){
    	printf("%d\n",i);
		}
 * 
 */

public class Java024_for {
	
	public static void main(String[] args) {
	
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		
	}
}
