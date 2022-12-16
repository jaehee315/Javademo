package java018_collection;
/*
 * HashSet : 중복허용안되고, 순서 유지
 */

import java.util.HashSet;

public class Java193_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new 	HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		
		for(Integer it : set)
			System.out.println(it);

	}//end

}
