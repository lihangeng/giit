package TCP_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket();
		String str = "hello world!";
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("10.19.41.166"),3000);
		ds.send(dp);
		ds.close();
	}

}
