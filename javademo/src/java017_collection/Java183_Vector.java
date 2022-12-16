package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Java183_Vector {

	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);

	}//end
	
	private static Vector<Sawon>lines(String fileName) {
		
		Vector<Sawon> vt = new Vector<Sawon>();
		try(Scanner sc = new Scanner(new File(fileName))) {
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().split("[:/]");
//				System.out.println("%s %s %s %s", data[0], data[1], data[2], data[3]);
				
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]),
						Integer.parseInt(data[2]), Integer.parseInt(data[3]));
				
				vt.add(sn);

			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		return vt;
		
	}
	
	private static void prnDisplay(Vector<Sawon> vt) {
		
		for(Sawon sn : vt)
			System.out.println(sn.toString());
		
	}

}
