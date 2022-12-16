package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
	}

	public static void prnDisplay (ArrayList<String> aList) {
		for(String sn: aList) {
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
		}
				
	}
	
	
public static void process (ArrayList<String> aList) {
	System.out.println(aList.contains("jsp"));
		
	}

}
