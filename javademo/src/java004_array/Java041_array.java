package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		
		int [] data1 = new int[3]; // 0
		long [] data2 = new long[3]; // 0L
		float[] data3 = new float[3]; // 0.0f
		double[] data4 = new double[3]; // 0.0
		char [] data5 = new char[3]; // \u0000
		boolean[] data6 = new boolean[3]; // false
		String[] data7 = new String[3]; // null
		
		for(int i =0; i<data6.length; i++) {
			System.out.printf("data[%d]=%b\n", i, data6[i]);
		}
		
		char a = ' ';
		char b = '\u0020'; // 공백
		char c =0;
		char d ='\u0000';
		
		
		System.out.println(a==b); // 참
		System.out.println(c==d); // 참
		

	}//end

}
