package giit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {

//		Class class1 = null;
//		try {
//			class1 = Class.forName("annotationTest.Jiangsu");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		Annotation[] annotation = class1.getAnnotations();
//		System.out.println("annotation:"+annotation.toString());
		final List<String> list =new ArrayList<String>();
		list.add("1");
//		File file = new File("D:");
//		try {
//			FileInputStream fis = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		SecurityManager security = System.getSecurityManager();
		if(security != null) {
			System.out.println("security is not null");
		}
		ArrayList list2 = new ArrayList<>();
		list.add("1");
		LinkedList list3 = new LinkedList<>();
		list3.add("2");
		Set set = new HashSet<>();
		set.add("hhh");
		try {
			InputStream is = new FileInputStream(new File("D:tt.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
