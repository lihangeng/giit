package HttpRequestTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpRequest {
	
	public static String sendGet(String url,String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			URLConnection connection = realUrl.openConnection();
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.connect();
			Map<String,List<String>> map = connection.getHeaderFields();
			for(String key:map.keySet()) {
				System.out.println(key+"--->"+map.get(key));
			}
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while((line = in.readLine()) != null) {
				result += line;
			}
		}catch(Exception e) {
			System.out.println("发送get请求出现异常"+e);
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
			}catch(Exception e) {
				in = null;
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static String setPut(String url,String param) {
		String result = "";
		String urlNameString = url+"?"+param;
		BufferedReader in = null;
		try {
			URL realUrl = new URL(urlNameString);
			URLConnection connection = realUrl.openConnection();
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.connect();
			Map<String,List<String>> map = connection.getHeaderFields();
			for(String key:map.keySet()) {
				System.out.println(key+"---->"+map.get(key));
			}
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				in = null;
			}
		}
		return result;
		
	}

}
