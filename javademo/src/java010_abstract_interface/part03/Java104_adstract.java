package java010_abstract_interface.part03;

public class Java104_adstract {

	public static void main(String[] args) {
		Piano p = new Piano("piano");
		System.out.println(p.name);
		p.play();
		
		Flute f = new Flute("Flute");
		System.out.println(f.name);
		f.play();
	}
}
