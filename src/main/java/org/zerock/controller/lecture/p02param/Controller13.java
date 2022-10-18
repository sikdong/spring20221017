package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.domain.lecture.JavaBean01;
import org.zerock.controller.domain.lecture.JavaBean02;

@Controller
@RequestMapping("ex13")
public class Controller13 {
	@RequestMapping("sub01")
	public void method1(JavaBean01 bean1) {
		System.out.println("메소드 1번 일함");
		System.out.println(bean1.getName());
		System.out.println(bean1.getAddress());
		System.out.println(bean1.getEmail());
	}
	
	@RequestMapping("sub02")
	public void method2(JavaBean02 bean) {
		System.out.println(bean.getName());
		System.out.println(bean.getAge());
		System.out.println(bean.getPassword());
		System.out.println(bean.getEmail());
	}
	
}
