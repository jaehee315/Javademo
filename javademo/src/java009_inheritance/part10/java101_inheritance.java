package java009_inheritance.part10;
/*
 * true	8	10
 * 
 * true 10 15  192.68.24.1
 */

public class java101_inheritance {
	public static void main(String[] args) {
		BasicTv btv = new BasicTv();
		btv.isPowerOn = true;
		btv.channel = 8;
		btv.volume = 10;
		btv.display();
		
		System.out.println("*************************************");
		SmarTv stv = new SmarTv();
		stv.isPowerOn = true;
		stv.channel = 10;
		stv.volume = 15;
		stv.ip= "192.68.24.1";
		stv.display();
	}

}
