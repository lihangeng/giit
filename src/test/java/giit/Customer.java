//package giit;
//
//import javax.jms.Connection;
//import javax.jms.ConnectionFactory;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.MessageConsumer;
//import javax.jms.Session;
//import javax.jms.TextMessage;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//public class Customer {
//
//	public static void main(String[] args) throws JMSException {
//		
//		String jmsProviderAdderss = "tcp://localhost:61616";
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(jmsProviderAdderss);
//		Connection connection = connectionFactory.createConnection();
//		
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//	    Destination dest = session.createQueue("demoQueue");
//	    MessageConsumer consumer = session.createConsumer(dest);
//	    connection.start();
//	    Message message = consumer.receive();  
//	    
//        TextMessage textMessage = (TextMessage) message;  
//  
//        String text = textMessage.getText();  
//  
//        System.out.println("从ActiveMQ取回一条消息: " + text);  
//  
//        consumer.close();  
//        session.close();  
//        connection.close();
//	}
//
//}
