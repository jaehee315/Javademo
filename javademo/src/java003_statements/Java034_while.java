package java003_statements;
/*
 * wile(조건식){
 * 반복 수행 문장;
 * }
 * 
 * while문은 조건식을 생략할 수 없다.
 */

public class Java034_while {
	
	public static void main(String[] args) {
	/*	for(int i = 1; i <=5; i++) {
			System.err.println(i);
		}*/
		
	//////////////////////////////////////
		
		//int i =0
		//while(i<=5){
			//System.out.println(i);
		//	i++;
		//}
		
	//////////////////////////////////////	
		
	//	int i =0;
	//	while(i <=5){
	//		System.out.println(i++);
			
	//	}
		
	///////////////////////////////////////	
		
	//	int i =0;
	//	while(++i <=5){
	//		System.out.println(i);
			
	//	}
		
	////////////////////////////////////////	
		
		int i =0;
		while(i++ < 5){
			System.out.println(i);
			
		}
		
		
		
	}//end

}
