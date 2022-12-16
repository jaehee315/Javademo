package java013_api;

public class Java145_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		
		if(data>='a' && data<='z') {
			System.out.println((char)(data -32));
		}
	
		System.out.println(Character.toChars(data));
		System.out.println(Character.toChars(data));
		System.out.println(Character.isUpperCase(data));
		System.err.println(Character.isLowerCase(data));
		System.out.println(Character.isDigit(data));
		System.out.println(Character.toString(data));
		
		
	}//end

}
