package java011_casting.part04;

public class Java112_binding {
	
	public static void process(HomeTv tv) {
		 tv.turnOn();
		 tv.soundUp();
		 if(tv instanceof SamsungTv) {
			 SamsungTv stv = (SamsungTv) tv;
			 stv.move();
		 } else if(tv instanceof LgTv) {
			 LgTv ltv = (LgTv)tv;
			 ltv.call();
		 }
	
	}
	
	public static void main(String[] args) {
		LgTv ltv = new LgTv("LG");
		process(ltv);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		process(ss);
	}
}
