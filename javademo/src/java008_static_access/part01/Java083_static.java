package java008_static_access.part01;
/*
 * static
 * 1. class loader일때 method area에저장이 된다.
 * 2. 같은 틀래스로 생성된 객체끼리 공유 해서 사용됨
 * 3. static 키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
 */

public class Java083_static {

	public static void main(String[] args) {
		System.out.printf("StaticEx.y=%d\n", StaticEx.y);
		
		
		StaticEx se =  new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);

		StaticEx ss =  new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y =30;
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		System.out.printf("se.x=%d, se.y=%d\n", ss.x, ss.y);

	}//end 

}
