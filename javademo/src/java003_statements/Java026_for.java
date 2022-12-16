package java003_statements;
/*
 * i=1 sum=1
 * i=3 sum=3
 * i=6 sum=6
 * i=10 sum10
 * i=15 sum=15
 * 
 */
public class Java026_for {
	
	public static void main(String[] args) {
		
		
		int i;
		int sum = 0;
		
		
		for(i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d sum=%d\n", i, sum);
			if(sum>=15) {
				break;
			}
		}	
		
		
		
	} //end
		
}
