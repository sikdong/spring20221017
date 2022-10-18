package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex10")
public class Controller10 {
	@GetMapping("sub01")
	public void method1(@RequestParam("name") String name) {
		System.out.println(name);
	}

	public void method2(@RequestParam(name="city", required=false) String name) 
	{}	
	
	@GetMapping("sub03")
	public void method3(@RequestParam(name="address", required=false) String a) {
		System.out.println(a);
	}
	
	@GetMapping("sub05")
	public void method5(@RequestParam(name="address", defaultValue = "seoul") String a) {
		System.out.println(a);
	}
}

