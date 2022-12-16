package java005_method;

public class Java063_method {

	public static void main(String[] args) {
		char[] arr = {'j','a','v','a', 't','a','t','a'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);

	}
	
	public static char[] reverse(char[]data) {
		char [] alpa = new char[data.length];
		
//		alpa[0] = data[8];
//		alpa[1] = data[7];
		////////////
//		alpa[8] = data[0];
		
		for(int i =0; i < alpa.length; i++) {
			alpa[i] = data[data.length-1 -i];
		}
		
		return alpa;
	}
}
