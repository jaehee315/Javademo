package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Java206_clone {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList);
		
		//shallow copy : 주소족사가 되기 때문
		ArrayList<Integer> copyList = aList;
		System.out.println("copyLst" + copyList);
		
//		copyList.set(0, 10);
//		System.out.println("sourceList" + aList);
//		System.out.println("copyLst" + copyList);
		
		ArrayList<Integer> destList = new ArrayList<Integer>();
		for(int i =0; i<aList.size(); i++) {
			destList.add(aList.get(i));
		}
		
		
		System.out.println("destList:" + destList);
		destList.set(0, 20);
		System.out.println("soureList:" + aList);
		System.out.println("destList" + destList);
		
		ArrayList<Integer> cloneList = (ArrayList<Integer>)aList.clone();
		System.out.println("cloneList:" + cloneList);
		
		cloneList.set(0, 30);
		System.out.println("soureList:" + aList);
		System.out.println("cloneList:" + cloneList);
		
	}

}
