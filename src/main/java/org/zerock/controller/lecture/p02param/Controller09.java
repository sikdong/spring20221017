package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {
	
	@GetMapping("sub01")
	public void method1(@RequestParam (name = "address")String a) {
		//String a = request.getParameter("address")
		System.out.println(a);
	}
	
	@GetMapping("sub02")
	public void method2(@RequestParam (name = "name") String a) {
		System.out.println(a);
	}
	
	@GetMapping("sub03")
	public void method3(@RequestParam ("name") String a) {
		System.out.println(a);
		//이것도 가능 value = "name" => value 생략 가능
	}
	
	@GetMapping("sub05")
	public void method5(@RequestParam("name") String a, @RequestParam("address") String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	@GetMapping("sub06")
	public void method6(@RequestParam("q") String a, @RequestParam("age") String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	@GetMapping("sub08")
	public void method7(@RequestParam("num1") int a, @RequestParam("num2") int b) {
	// 기본타입 wrap 타입 , string 다 자동 형변환
		System.out.println(a + b);
	}
}
