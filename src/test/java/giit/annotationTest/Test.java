package giit.annotationTest;

import java.lang.annotation.Annotation;

public class Test {

	public static void main(String[] args) {

		Class c =null;
		try {
			c = Class.forName("giit.annotationTest.Jiangsu");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Annotation[] annotations = c.getAnnotations();
		if(annotations.length>0) {
			for(Annotation annotation:annotations) {
				System.out.println("annotation"+annotation.toString());
			}
		}
		
	}

}
