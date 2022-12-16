package java021_network;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class Java219_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.naver.com/movie/bi/mi/basic.naver?code=74977");
			System.out.println("gatHost():" + url.getHost());
			System.out.println("getProtocol():" + url.getProtocol());
			System.out.println("getPort():" + url.getPort());
			System.out.println("getpath():" + url.getPath());
			System.out.println("getQuery():" + url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
