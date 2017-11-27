package TCP_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRecv {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket(3000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		String str = new String(dp.getData(),0,dp.getLength());
		System.out.println(str);
		System.out.println("IP:"+dp.getSocketAddress()+"port:"+dp.getPort());
		ds.close();
	}

}
