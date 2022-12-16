package java009_inheritance.part01;
/*
 * 상속(inheritance) : 다른 클래스가 가지고있능 맴버들을 새로 클래스에서 직접 만들지 않고
 * 		상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있게 만들 기술이다.
 * 
 * 상속(inheritance)
 * 1. 기본 클래스를 재사용해서 새로운 클래스를 정의하는 기능이다.
 * 2. 두 클래스를 조상과 자손 관계를 맺어주는 것 (extends)
 * 3. 상속을 해주는 클래스 : 수퍼클래스, 부모클래스, 기본클래스
 * 	  상속을 받는 클래스 : 서브클래스, 자식클래스, 유도클래스
 * 4. 자식(자손)클래스는 조상의 모든 자원을 상속받는다. (생성자, static{}는 제외)
 * 5. 자식(자손)의 자원은 부모보다 크거나 같아야 한다.
 * 6. 상속을 할떄 사용되는 키워드 : 
 * 		클래스를 클래스에 상속 : extends(단일상속), 인터페이스 상속 : extends(다중상속)
 * 
 * class A{}
 * class B extends A{}
 * 
 * => 자식클래스 B extends 부모클래스 A
 * 
 * -A는 B에게 상속한다.
 * -B는 A이다. (상속관계의 클라스를 is a 관계라 한다.)
 * 		
 */



public class Java092_inheritance {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("b=" + child.b);
		System.out.println("a=" + child.a);
	
		child.display();
		
		System.out.println(child.toString());

	}

}
