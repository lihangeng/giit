package giit;

import java.lang.annotation.Annotation;

public class MainTest {

	public static void main(String[] args) {

		Class class1 = null;
		try {
			class1 = Class.forName("annotationTest.Jiangsu");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Annotation[] annotation = class1.getAnnotations();
		System.out.println("annotation:"+annotation.toString());
	}

}
