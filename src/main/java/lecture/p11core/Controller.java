package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	private Service service;
	
	// 넣어도 주입해주고 안 넣어도 주입해 줄수 있음
	@Autowired
	public Controller(Service service) {
		this.service = service;
	}
	
	public Service getService() {
		return service;
	}
}
