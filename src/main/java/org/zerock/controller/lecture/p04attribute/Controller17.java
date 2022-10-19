package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.domain.lecture.JavaBean01;

@Controller
@RequestMapping("ex17")
public class Controller17 {
	
	@RequestMapping("sub01")
	public void method1(Model model) {
		model.addAttribute("myName", "son");
	}
	
	@RequestMapping("sub02")
	public void method2(Model m) {
		m.addAttribute("email", "abc@daum.net");
	}
	
	@RequestMapping("sub03")
	public void method3(Model m) {
		m.addAttribute("name", "a");
		m.addAttribute("address", "b");
		m.addAttribute("age", "99");
	}
	
	@RequestMapping("sub04")
	public void method4(Model m) {
		JavaBean01 obj = new JavaBean01();
		obj.setName("a");
		obj.setAddress("b");
		obj.setEmail("c");
		m.addAttribute("student", obj);
		
	}
}
