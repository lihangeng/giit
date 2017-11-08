package Nio;

import java.io.IOException;
import java.net.Socket;

public class ConnectIOnHandler extends Thread{
	
	private Socket socket;
	
	public ConnectIOnHandler() {
		this.socket = socket;
	}

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted() && !socket.isClosed()) {
			try {
				String something = socket.getOutputStream().toString();
				if(something != null) {
					System.out.println("处理something");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	
	

}
