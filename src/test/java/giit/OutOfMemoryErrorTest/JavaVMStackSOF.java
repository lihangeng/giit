package giit.OutOfMemoryErrorTest;

import java.util.HashMap;
import java.util.Map;

public class JavaVMStackSOF {
	
	private int stackLegth = 1;
	
	public void stackLeak() {
		stackLegth ++;
		stackLeak();
	}

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "2");
		String s ="111";
		s.intern();
		System.currentTimeMillis();
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		}catch(Throwable e) {
            System.out.println("stack length:"+oom.stackLegth);
            throw e;
		}
	}

}
