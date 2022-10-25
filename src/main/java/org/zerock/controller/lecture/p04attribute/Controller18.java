package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.Student;

import lombok.Data;

@Controller
@RequestMapping("ex18")
public class Controller18 {
	
	@RequestMapping("sub05")
	public void method5(Model m) {
		Student s = new Student();
		s.setName("park ji sung");
		s.setClassName("manU");
		s.setStudentNumber("13");
		
//		m.addAttribute("student", s); 클래스 명이 lowercase 된 형태로 자연스럽게 바뀜
		// 그래서 밑에처럼 생략해서 써도 가능
		m.addAttribute(s);
		
	}
	
	@RequestMapping("sub01")
	public void method01(
			@ModelAttribute("bean")
			JavaBean01 b) {
		
	}
	
	@RequestMapping("sub02")
	public void method2(@ModelAttribute("bean2") JavaBean02 j) {
		
	}
	
}


