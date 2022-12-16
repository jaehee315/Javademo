package java001_basic;


/*
 * Ctrl + Shift + / : 블록을 주석으로 처리 
 * Ctrl + / : 한줄 or 블록 주석 처리 / 해제 
 * Ctrl + Shift + \ : 블록 주석을 해제
 * 
 * 
 */

public class Java004_casting {

	public static void main(String[] args) {
		
		byte bNum = 2; //-128 - 127
		short sNum = 4; // -32,768 - 32,767
		int xNum = 5;
		long lNum = 6L; // L or 1
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a';
		
		System.out.print(lNum);
		System.out.print(fNum);
		
		//형변환
		//1. 묵시적 형변환: 작은데이터 타입을 큼 데이터 타입으로 변환할때 발생
		//2. 명시적 형변환: 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		long gNum = 6; //묵시적 형변환
		
		//데이터 손실이 되는 경우
		byte data = (byte)128;
		System.out.print(data);
		
	}//end main()

}//end class
