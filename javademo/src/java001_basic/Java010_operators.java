package java001_basic;

public class Java010_operators {
	
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		//전위형 : 값이 참조 되기 전에 증가
		j = ++i;
		System.out.printf("i=%d, j=%d\n", i, j);
		
		
		i = 5;
		j = 0;
		
		//후위형: 값이 참조된 후 증가
		j = i++;
		System.out.printf("i=%d, j=%d\n", i, j);
		
		
	}

}
