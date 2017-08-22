//package giit;
//
//public class SmsSendAsync {
//	
//	public String prtNo;
//	
//	public SmsSendAsync(String prtNo) {
//		this.prtNo = prtNo;
//	}
//	
//	public void send() {
//		new Thread() {
//			public void run() {
//				try {
//                      Thread.sleep(10000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("send");
//			}
//		}.start();
//	}
//
//	public static void main(String[] args) {
//		
//		String prtNO = "10010";
//		//异步调用
//		SmsSendAsync smsSendAsync = new SmsSendAsync(prtNO);
//		smsSendAsync.send();
//		System.out.println("已经签单");
//	}
//
//}
