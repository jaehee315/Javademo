package java011_casting.part03;

public class LgTv {
	String maker;
	
	public  LgTv() {
		
	}
	
	public LgTv(String maker) {
		this.maker = maker;
		
	}
	
	public void turnOn() {
		System.out.printf("%s Tv-전원을 켠다.\n", maker);
		
	}

	public void turnOff() {
		System.out.printf("%s Tv-전원을 끈다.\n", maker);
		
	}
	
	public void soundUP() {
		System.out.printf("%s Tv-소리를 높인다.\n", maker);
		
	}
	
	public void sounddown() {
		System.out.printf("%s Tv-소리를 줄인다.\n", maker);
		
	}
	
	public void call() {
		System.out.printf("LG call");
		
	}
}
