package java002_statements;
/*
 * if{
 * 문장;
 * }else{
 * 문장;
 * }
 * 
 */
public class Java018_if {
	
	public static void main(String[] args) {
		boolean member = true; // 회원(참) or 비회원(거짓)
		String grade = "일반"; //회원등급
		
		if(member) {
			//회원
			if(grade=="VIP") {
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 30);
			}else {
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 10);
			}
			
		}else{
			//비회원
			System.out.printf("고객님은 %s이며 %d%%적립\n", "비회원", 0);
		}
	}

}
