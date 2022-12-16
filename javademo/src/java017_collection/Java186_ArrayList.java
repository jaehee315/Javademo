package java017_collection;

import java.util.ArrayList;

public class Java186_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		
		String[] arr = display(aList);
		for(String data : aList)
			System.out.println(data);
		

	}//end
	
	public static String[] display(ArrayList<String> aList) {
//		String[] stn = new String[aList.size()];
//		for(int i =0; i<aList.size(); i++) {
//			stn[i] = aList.get(i);
//		}
		
//		return stn;
		//////////////////////////////////////////////////////////
//		String[] stn = new String[aList.size()];
//		return aList.toArray(stn);
//	}
	
	return aList.toArray(new String[aList.size()]);

	}
}
