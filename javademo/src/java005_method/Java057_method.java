package java005_method;
/*
 * 
 * 자바에서 제공하는 데이터 타입
 * 1.primitive data : byte, short, int, long,float, double, boolean, char
 * 2.reference data : arr, class, interface, enum
 * 
 * [argument 전달 방식]
 * 1.call by value : 값에 의한 복사
 */

public class Java057_method {

	public static void main(String[] args) {
		int a = 10, b = 20;
		callByValue(a, b);
		System.out.printf("a=%d, b=%d\n", a, b);
		
		int[] num = new int[] {10, 20};
		callByReference(num);	
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);
	}//end main()
	
	public static void callByValue(int c,int d) {
		int temp = c;
		c = d;
		d = temp;
	
		System.out.printf("c=%d, b=%d\n", c, d);
	}
	
	public static void callByReference(int arr[]) {
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		
		System.out.printf("arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
	}

}//end class
