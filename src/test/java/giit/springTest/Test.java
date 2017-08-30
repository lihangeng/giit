package giit.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

	ApplicationContext  context= new FileSystemXmlApplicationContext("src\\test\\java\\giit\\springTest\\spring.xml");
	A a = (A)context.getBean("a");
	System.out.println(a);
	}

}
