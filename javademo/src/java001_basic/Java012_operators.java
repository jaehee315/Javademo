package java001_basic;

/*
 * true && true => true
 * true && fales => false
 * false && true => false
 * false && false => false
 * 
 * 
 * 
 * true || true => true
 * true || fales => true
 * 
 * 
 * !true => fales
 * !false => true
 * 
 */

public class Java012_operators {
	
	public static void main(String[] args) {
		
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res;
		
		res = x < y && x == z;
		System.out.println(res); // 참
		
		res = x > y || x == z;
		System.out.println(res); // 참
				
		
	}

}
