package giit.springTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//	ApplicationContext  context= new FileSystemXmlApplicationContext("src\\test\\java\\giit\\springTest\\spring.xml");
//	A a = (A)context.getBean("a");
//	System.out.println(a);
		
		Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		ArrayList<String> list =  new ArrayList<String>();
		list.add("hello");
		map.put("1", list);
		list.add("world");
		System.out.println();
	}

}
