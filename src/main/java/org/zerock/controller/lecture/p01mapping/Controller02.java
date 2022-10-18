package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex02")
public class Controller02 {
	// servlet에서 주로했던 작업
	//1. 요청받고
	//2. request parameter 수집
	//3. requset parameter 가공
	//4. business logic
	//5. add attribute
	//6. forward/ redirect
	
	@RequestMapping("sub03")
	public void method03() {
		System.out.println("메소드 3번 일함");
	}
}
