package java001_basic;

public class Java005_print {
	
	public static void main(String[] args) {
		
		byte bNum = 2; //-128 - 127
		short sNum = 4; // -32,768 - 32,767
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; // true or sNum
		String sData = "java";
		
		System.out.println(bNum + ", " + sNum);
		
		/*
		 * system.out.print("출력형식");
		 * 출력기호
		 * %d : 정수(byte, short, int, long)
		 * %f : 실수(float,double)
		 * %b : 논리(boolean)
		 * %c : 문자(char)
		 * %s : 문자열(string)
		 * %% : %
		 * 
		 */
		
		System.out.printf("%d %d %d %d", bNum, sNum, xNum, lNum);
		System.out.printf("%.1f %.1f %c %b %s/n", fNum, dNum, cData, eNum, sData);
		System.out.printf("%d % %d = %d/n" , 5, 2, 5%2 );
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	}//end amin()

}//end class
