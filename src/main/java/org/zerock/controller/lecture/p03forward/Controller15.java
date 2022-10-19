package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {
	
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("메소드 1");
	}
	
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("뭐가 많다");
	}
	
	@RequestMapping("sub03")
	public String method3() {
		return null;// void처럼 default view name을 사용해서 view로 포워드
	}
	
	@RequestMapping("sub04")
	public String method4() {
		return null;// void처럼 default view name을 사용해서 view로 포워드
	}
	
	@RequestMapping("sub05")
	public String method5(String name) {
		if(name==null) {
			return null;
		}
		return "ex15/sub051";
	}
	
	@RequestMapping("sub06")
	public String method6(String address) {
		if(address == null) {
			return null;
		}
		return "ex15/sub061";
	}
}
