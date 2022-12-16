package java002_statements;
/*
 * 다중 if~else
 * if(조건 1){
		//실행 1//
	} else if(조건 2){
		//실행 2//
	} else if(조건 3){
		// ... //
	} else if(조건 n){
		//실행 n//
	}else{
		//그 외 실행
	}
 */

public class Java019_if {
public static void main(String[] args) {
	char code = 'B';
			
			if(code=='A') {
				System.out.println("식품류");
			}else if(code=='B'){
				System.out.println("육류");
			}else if(code=='c'){
				System.out.println("공산품");
			}else {
				System.out.println("기타");
		}
	}
}
