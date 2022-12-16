package java003_statements;

public class Java033_for {
	/*
	 * 반복문에서 특정 위치로 이동(continum)
	 */
	
	public static void main(String[] args) {
		move:// label 선언
		for(int k =1; k<5; k++) {
			go: // label 선언
			for(int i =1; i<=3; i++) {
				for(int j = 1; j<=2; j++) {
					System.out.printf("j=%d\n", j);
					//break;
					//break go;
					//beeak move;
					continue move;
				}
				System.out.printf("j=%d\n", i);
			}
			System.out.println("kkk");
		}
		System.out.println("program end");
	
	}//end
}
