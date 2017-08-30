package giit.springTest;

import org.springframework.stereotype.Service;

@Service
public class B {
	
	public String funb() {
		System.out.println("funb");
		return "B.funb";
	}
	
	public B(){
		System.out.println("B initialed");
	}
}
