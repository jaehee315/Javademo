package java005_method;

import com.sun.tools.javac.launcher.Main;

/*
 * 1.리턴값이 없고 매개변수도 없는 상태
 * 	void add(){
 * 		int x = 10;
 * 		int y = 20;
 *  
 *  	system.out.println(x+y);
 * }
 * 
 * 		add();
 * 
 * 
 * 2.리턴값이 있고 매개변수는 없는 형태
 * 
 * 	double avg(){
 * 		int x = 10;
 * 		int y = 20;
 * 
 * 		return (x+y)/2.0;
 * }
 * 
 * 
 * 3. 리턴값이 없고 매개변수는 있는 형태 (parameter-매개변수)
 * 		void plus(int x, int y){
 * 			system.out.println(x+y);
 * }
 * 			(argument-인수)
 * plus(10, 20);
 * 
 * 4.리턴값이 있고 매개변수도 있는 형태
 * double avg(int x, int y){
 * 	return (x+y)/2.0;
 * }
 * 
 */

public class Java052_method {
	/*
	 * 프로그램을 실행하면
	 * main스레드가 main()메소드를 실행한다
	 */

	public static void main(String[] args) { //1
		System.out.println("main start"); //2
		makeTest(); //3
		System.out.println("main end"); //7
	}//end  //8
	
	public static void makeTest() { //4
		System.out.println("makeTest run"); //5
	} //6

}
