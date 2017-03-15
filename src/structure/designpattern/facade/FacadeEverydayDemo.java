package structure.designpattern.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class FacadeEverydayDemo {

	public static void main(String[] args) {
		try {//is example of facade
			URL url = new URL("http", "www.pluralsight.com",80,"/author/hailelul-teshome");
//the commented out code is not related mycode			
//			URL url = new URL("https://www.amrood.com/index.htm?language=en#j2se");
//			System.out.println("URL is " + url.toString());
//	         System.out.println("protocol is " + url.getProtocol());
//	         System.out.println("authority is " + url.getAuthority());
//	         System.out.println("file name is " + url.getFile());
//	         System.out.println("host is " + url.getHost());
//	         System.out.println("path is " + url.getPath());
//	         System.out.println("port is " + url.getPort());
//	         System.out.println("default port is " + url.getDefaultPort());
//	         System.out.println("query is " + url.getQuery());
//	         System.out.println("ref is " + url.getRef());
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine;
			while((inputLine = in.readLine())!= null){
				System.out.println(inputLine);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
