//package giit;
//
//import javax.jms.Connection;
//import javax.jms.ConnectionFactory;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.MessageProducer;
//import javax.jms.Session;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//public class Producer {
//
//	public static void main(String[] args) throws JMSException {
//
//		String jmsProviderAdderss = "tcp://localhost:61616";
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(jmsProviderAdderss);
//		Connection connection = connectionFactory.createConnection();
//		
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//	    Destination dest = session.createQueue("demoQueue");
//	    MessageProducer producer = session.createProducer(dest);
//	    Message message = session.createTextMessage("hello world");
//	    producer.send(message);
//	    
//	    producer.close();
//	    session.close();
//	    connection.close();
//	    
//	}
//
//}
