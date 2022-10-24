package org.zerock.controller.lecture.p02param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex08")
public class Controller08 {
	@GetMapping("sub01")
	public void method1() {
		System.out.println("1번 일함!!");
	}

	@GetMapping("sub011")
	public void method11() {
		System.out.println("하이하이");
	}

	@GetMapping("sub02")
	public void method2(HttpServletRequest request) {
		System.out.println("2번 일함!!");

		System.out.println(request.getParameter("name"));
	}

	// sub03 경로
	// get 방식
	@GetMapping("sub03")
	public void method3(HttpServletRequest request) {
		System.out.println(request.getParameter("name"));
	}

}
