package java020_thread.part05;

//공유자원
public class Washroom {
	
 synchronized void openDoor(String name) {
		
		System.out.println(name + "님이 입장");
		for(int i=0; i<50000; i++) {
			if(i%10000 == 0) {
				try {
					
					//10000은 1초이다.
					//1초 동안 blocked상태로 빠진다.
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(name + "님이 용무 보는 중");
			}
		}
		
		
		System.out.println(name + "님이 퇴장");
		
	}//openDoor()
}
