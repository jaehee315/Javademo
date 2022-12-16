package java017_collection;

import java.util.ArrayList;

/*
 * vector와 ArrayList
 * 
 * 1.vector은 동기화 처리가 되여 있고 ArrayList는 비동기화 처리한다.
 * 2.vector와 ArrayList은 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 3. vector와 ArrayList의 클래스는 처리방법이 비슷함.
 * 4.vector와 ArrayList은 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아님.
 */


//Ctr1 + Shift + 0
public class Java184_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		System.out.println();
		for(int i=0; i<aList.size(); i++)
			System.out.println(aList.get(i));
		
		System.out.println("=========================");
		for(int it : aList)
			System.out.println(it);
		
		System.out.println("=========================");
		System.out.println(aList.remove(0));
		
		
		System.out.println("=========================");
		for(int it : aList)
			System.out.println(it);

	}

}
