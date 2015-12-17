
package com.usky.test.net;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AsynchronousHttpUtil {
	
	public static String get(HttpClient httpClient, String url, ResponseHandler<String> responseHandler, HttpContext httpContext) throws ClientProtocolException, IOException {
		HttpGet httpGet = new HttpGet(url);
		return httpClient.execute(httpGet, responseHandler, httpContext);
	}
	
	public static String post(HttpClient httpClient, String url, Map<String, String> paramMap, ResponseHandler<String> responseHandler, HttpContext httpContext) throws ClientProtocolException, IOException {
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		for (Entry<String, String> entry : paramMap.entrySet()) {
			nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
		return httpClient.execute(httpPost, responseHandler, httpContext);
	}
	
	public static void record(String code) throws IOException {
		File file = new File("G:/log.txt");
		if (file.length() >= 10240) {
			int i = 1;
			File temp;
			do {
				temp = new File("G:/log" + i + ".txt");
				i++;
			} while (temp.exists());
			file.renameTo(temp);
		}
		FileWriter writer = new FileWriter(file, true);
		writer.append(System.currentTimeMillis() + ":" + code + "|");
		writer.flush();
		writer.close();
	}
	
	public static void main(String[] args) throws ClientProtocolException, IOException, ParserException, InterruptedException {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("email", "af301601@gmail.com");
		paramMap.put("password", "cmd3134");
		paramMap.put("url", "/home/");
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		post(httpClient, "http://www.kaixin001.com/login/login.php", paramMap, responseHandler, null);
		while (true) {
			try {
				String response = get(httpClient, "http://www.kaixin001.com/find/search.php?real_name=������&city=Ϥ��&gender=2&agespan=all", responseHandler, null);
				Parser parser = Parser.createParser(response, "utf8");
				NodeList nodeList = parser.extractAllNodesThatMatch(new TagNameFilter("div"));
				for (Node node : nodeList.toNodeArray()) {
					Div div = (Div) node;
					String cls = div.getAttribute("class");
					if (cls != null && cls.equals("ts41p f14 l")) {
						if (((TagNode) div.getChild(0)).getTagName().equalsIgnoreCase("img")) {
							record("#");
							System.out.print("#");
						} else {
							record("*");
							System.out.print("*");
						}
					}
				}
				Thread.sleep(50000);
			} catch (HttpHostConnectException e) {
				System.out.println("\nTime out!");
			}
		}
	}
}
