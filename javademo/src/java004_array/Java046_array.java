package java004_array;

public class Java046_array {

	public static void main(String[] args) {
		
		int[][] num = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
				
		for (int i =0; i < num.length; i++) {
			for(int j = 0; j< num[i].length; j++) {
					if(num[i][j] % 3 == 0) {
						System.out.printf("%4c", '*');
						
					} else {
						System.out.println();
					}
					
					System.out.println();
				}
		
			
			
		}
		
	}//end
}
