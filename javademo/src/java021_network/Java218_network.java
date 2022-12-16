package java021_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 네트워크 : 두 대 이상의 컴퓨터를 케이블로 연결하여 구성하는 기능.
 * 클라이언/서버 : 컴퓨터간의 관계를 역할ㄹ로 구분하는 개념이다.
 * 서버 : 서비스를 제공하는 컴퓨터이다.
 * 클라이언트 : 서비스를 제공받는 컴퓨터.
 * 서비스 : 서버가 클라이언트로 부터 요청 받는 작업을 처리하여 그 결과 ㅈ공하는 개념이다.
 * 네트워크 관ㄹ련된 저오 :  java.net.*
 * InetAddress : ip주소를 다루기 위한 클래스이다.
 */

public class Java218_network {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("daum.net");
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	

	}


