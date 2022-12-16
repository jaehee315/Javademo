package java004_array;

public class Java051_array {

	public static void main(String[] args) {
		char[][] color = new char[][] {{'r', 'e', 'd',}, {'g', 'r', 'e', 'n'}};
		
		for(int i= 0; i<color.length ;i++) {
			for(int j=0; j<color[i].length;j++) {
				System.out.printf("%4c", color[i][j]);
			}
			
		}

		System.out.println("=====================");
			for (int i = 0; i < color.length; i++) {
				System.out.println(color[i]);
		}
	}//end

}
