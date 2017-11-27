package Message;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class Messagedemo {

	public static void main(String[] args) throws HttpException, IOException {

		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://gbk.api.smschinese.cn/");
		post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");
		
		   NameValuePair[] data = {
	                new NameValuePair("Uid", "lihangeng"), // 注册的用户名
	                new NameValuePair("Key", "310480"), // 注册成功后,网站分配的密钥（不是密码）
	                new NameValuePair("smsMob", "18360453631"), // 给该手机号码发送内容
	                new NameValuePair("smsText", "你好,这是我使用Java程序群发的测试短信!"),};
	post.setRequestBody(data);
	client.executeMethod(post);
	Header[] headers = post.getResponseHeaders();
	int statusCode = post.getStatusCode();
	System.out.println("statusCode:" + statusCode);
    for (Header h : headers) {
        System.out.println(h.toString());
    }
    String result = new String(post.getResponseBodyAsString().getBytes(
            "gbk"));
    System.out.println(result);
    post.releaseConnection();
	}
}
