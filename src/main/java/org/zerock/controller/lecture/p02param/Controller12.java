package org.zerock.controller.lecture.p02param;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex12")
public class Controller12 {
	// /ex12/sub01?city=seoul&city=ny&city=tokyo
	@RequestMapping("sub01")
	public void method1(String city) {
		System.out.println(city);
	}
	
	@RequestMapping("sub02")
	public void method2(@RequestParam String[] city) {
		System.out.println(city);
	}
	
	@RequestMapping("sub03")
	public void method3(List<String> city) {
		System.out.println(city);
	}
	
	@GetMapping("sub04")
	public void method4(String name, String address, int age, String email, int password) {
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(email);
		System.out.println(password);
	}
}
