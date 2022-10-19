package org.zerock.controller.lecture.p03forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex14")
public class Controller14 {
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("메소드 1번 일한다");
		String path = "/WEB-INF/views/ex14/sub01.jsp";
		req.getRequestDispatcher(path).forward(req, res);
	}
	
	@RequestMapping("sub02")
	public String method2() {
		System.out.println("method2 일한다");
		
		return "abc"; // abc가 view의 이름이 된다 abc.jsp로 됨
					// 앞에는 /WEB-INF/views가 자동으로 붙음
	}
	
	@RequestMapping("sub03")
	public String method3() {
		System.out.println("method 3");
		return "xyz";
	}
	
	@RequestMapping("sub04")
	public String method4() {
		return "ex14/sub04";
	}
	
	@RequestMapping("sub05")
	public String method5() {
		return "ex14/sub05";
	}
}
