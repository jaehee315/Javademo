package java001_basic;


/* 리터널(1iteral) : 그 자체의 값(1, 2, B "a', 'b', 'c' . .., true, false)
 * 변수 (var sals12) : 하나의 값을 저장하기 위한 메로리 공간
 * 자바에서 제공하는 데이터 타입
 * Primitive Datatype (기본 데이터 타입)
 * byte < char,short < int < long (8byte)
 * 
 */


public class java003_dataType {
	public static void main(String[] args) {
		int data; // 데이터타입 변수명;
		
		
		data = 3; //데이터 변수에 3값을 할당(저장)
		
		System.out.print(data); //3
		
		data = 10;
		System.out.print(data);
		
		double avg = 4;
		System.out.println(avg);
		
		/* int num = 4.0; */
		
		int x =0101; // 8진수
		System.out.println(x);
		
		int y = 65;  // 10진수
		System.out.print(y);
		
		int z = 0B101; //2진수
		System.out.print(z);
		
		int k = 0x101; //  16진수 
		System.out.print(k);
		
	}
}

