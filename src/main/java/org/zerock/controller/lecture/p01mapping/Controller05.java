package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex05")
public class Controller05 {
	
	@RequestMapping(value="sub01", method=RequestMethod.GET)
	public void method1() {
		System.out.println("method1 !!!!");
		
	}
	
	// requestmapping의 get 방식과 같음 
	@GetMapping("sub02")
	public void method2() {
	
		System.out.println("2번도 일함");
	}
	
	@PostMapping("sub02")
	public void method3() {
		System.out.println("3번도 일함");
	}
	
	//get 방식
	//sub04 경로
	@GetMapping("sub04")
	public void method5() {
		System.out.println("5번 일함");
	}
	
	
	//post 방식
	//sub05 경로
	@PostMapping("sub05")
	public void method6() {
		System.out.println("6번 일함");
		
		}
}
