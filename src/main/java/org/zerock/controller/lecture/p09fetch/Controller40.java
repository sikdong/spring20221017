package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex40")
public class Controller40 {
	
	@RequestMapping("sub0")
	public void method1() {
		
	}
	
	@GetMapping("sub01")
	public void method2() {
		System.out.println("잘 받았음");
	}
	
	@PostMapping("sub03")
	public void method3() {
		System.out.println("post 방식 잘 받음");
	}
	
	@GetMapping("sub04")
	public void method4() {
		System.out.println("get");
	}
	
	@PostMapping("sub04")
	public void method5() {
		System.out.println("post");
	}
	
	@RequestMapping(path="sub04", method = RequestMethod.PUT)
	public void method6() {
		System.out.println("put");
	}
	
	@DeleteMapping("sub04")
	public void method7(){
		System.out.println("delete");
	}
}
