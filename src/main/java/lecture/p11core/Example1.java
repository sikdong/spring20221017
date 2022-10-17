package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example1 {
	private Example2 e2;
	
	@Autowired
	public Example1(Example2 e2) {
		this.e2 = e2;
	}
	
	public Example2 getE2() {
		return e2;
	}
}
