
package com.usky.test.net;

import java.io.IOException;
import java.net.FileNameMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MimetypeTest {
	
	public static void main(String[] args) {
		FileNameMap fileNameMap = URLConnection.getFileNameMap();
		String type = fileNameMap.getContentTypeFor("a.txt");
		System.out.println(type);
		
		try {
			String type2 = null;
			URL u = new URL("a.txt");
			URLConnection uc = null;
			uc = u.openConnection();
			type2 = uc.getContentType();
			System.out.println(type2);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
