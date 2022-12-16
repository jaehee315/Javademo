package java015_exception;

public class Java154_exception {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
		try {			
			num[4] = 20;
		}catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println(ex.toString());	
//			System.out.println(ex.toString());
			ex.printStackTrace();
	}

		
		
	}//end

}
