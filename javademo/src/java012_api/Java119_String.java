package java012_api;
/*
 * [출력결과]
 * aerok
 * korea
 */

public class Java119_String {

	public static void main(String[] args) {
			String sn = "korea";
			char[] data = display(sn);
			System.out.println(data);
			System.out.println(sn);

	}//end main()
	
	public static char[] display(String alpa) {
				
		char[] arr = new char[alpa.length()];
//		arr[0] = alpa.charAt(4);  //alpa.charAt(err.length -1)
//		arr[1] = alpa.charAt(3);  //alpa.charAt(err.length -1  -1) 
//		arr[2] = alpa.charAt(2);  //alpa.charAt(err.length -1  -2)
//		arr[3] = alpa.charAt(1);  //alpa.charAt(err.length -1  -3)
//		arr[4] = alpa.charAt(0);  //alpa.charAt(err.length -1  -4)
		
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = alpa.charAt(arr.length - 1);
		}
		
		return arr;
		
				
	}//end

}//end class
