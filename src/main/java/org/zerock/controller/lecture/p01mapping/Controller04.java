package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("1번 일한다");
	}
	
	@RequestMapping(value = "sub02", method=RequestMethod.GET)
	public void method2() {
		System.out.println("2번 일함");
		
	}
	
	@RequestMapping(value = "sub02", method=RequestMethod.POST)
	public void method3() {
		System.out.println("3번 포스트방식으로 일함");
		
	}
	
	@RequestMapping(value = "sub03", method= {RequestMethod.GET, RequestMethod.POST})
	public void method4() {
		System.out.println("4번 둘다 일하는 거가능");
	}
	
	@RequestMapping(value = "sub04", method= {RequestMethod.GET, RequestMethod.POST})
	public void method5() {
		System.out.println("5번 일함");
	}
}
