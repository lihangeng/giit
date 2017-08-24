package giit;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map =new HashMap<>();
		map.put("1", "a");
		String test = map.get("2");
	    if(test == null) {
	    	System.out.println("null");
	    }else {
	    	System.out.println("not null");
	    }
	}

}
