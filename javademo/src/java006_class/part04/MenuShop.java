package java006_class.part04;

/*
 * [부식점 프로램]
 * 1.메뉴명
 * 2.가격
 * 3.주문갯수
 * 4.계산작업을 한다.
 * 
 * 객체 속성 : 메뉴명, 가격, 주문갯수
 * 객체 기능 : 계산한다.
 * 
 * 메뉴명   가격      주문갯수
 * 떡볶이   2000		3
 * 김말이   500		2
 * 오뎅     300		4
 * 
 * 
 */

public class MenuShop {
	String menu;
	int price;
	int cnt;
	
	int count() {
		return price * cnt;
	}
	
	
	void display() {
		System.out.println("메뉴명:" + menu);
		System.out.println("가격:" + price);
		System.out.println("주문갯수:" + cnt);
		System.out.println("금액:" + this.count());
		
	}

}//end class



