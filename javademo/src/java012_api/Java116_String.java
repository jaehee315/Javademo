package java012_api;

public class Java116_String {
	
	public static void main(String[] args) {
		String sn = "java";
		String sg = "java";
		
		String st = new String ("java");
		String ss = new String ("java");
		
		//주소비교
		System.out.printf("sn == sg:%b\n", sn==sg); //참
		System.out.printf("st == ss:%b\n", st==ss); //거짓
		
		//메모리에 저장된 분자열 비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); //참
		System.out.printf("st.equals(ss):%b\n", st.equals(ss)); //참
	
		//메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
	
	}//end
}
