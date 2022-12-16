package java012_api;
/*
 * API(Application Programming Interface)
 * 
 * 
 * [출력결과]
 * java jsp spring
 */

public class Java121_String {

	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		char data[] = stn.toCharArray();
		System.out.println(process(data)); 
	}
	
	public static char [] process(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='_') {
				arr[i]= ' ';
			}
		}
		return arr;
		
	}//end

}//end class
