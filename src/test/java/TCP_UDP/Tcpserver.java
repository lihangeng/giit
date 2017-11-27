package TCP_UDP;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcpserver {

	public static void main(String[] args) throws Exception {

		ServerSocket listen = new ServerSocket(5050);
		Socket server = listen.accept();
		
		InputStream is = server.getInputStream();
		OutputStream os = server.getOutputStream();
		
		char c = (char) is.read();
		System.out.println("收到了:"+c);
		os.write('s');
		os.close();
		is.close();
		server.close();
		listen.close();
		
	}

}
