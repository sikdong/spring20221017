package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.controller.domain.lecture.JavaBean01;
import org.zerock.controller.domain.lecture.Student;

@Controller
@RequestMapping("ex22")
public class Controller22 {
	
	@RequestMapping("sub01")
	public String method1(Model m) {
		m.addAttribute("name", "parkjisung");
		return "redirect:/ex22/sub02";
	}
	
	@RequestMapping("sub02")
	public void method2(Model m) {
		boolean hasName = m.containsAttribute("name");
		System.out.println(hasName);
	}
	
	@RequestMapping("sub03")
	public String method3(HttpSession session) {
		session.setAttribute("name", "parkjisung");
		
		return "redirect:/ex22/sub04";
	}
	
	@RequestMapping("sub04")
	public void method4(HttpSession session) {
		String name = (String) session.getAttribute("name");
		System.out.println(name);
	}
	
	@RequestMapping("sub05")
	public String method5(HttpSession s) {
		Student stu = new Student();
		stu.setName("son");
		stu.setClassName("tottenham");
		stu.setStudentNumber("7");
		
		s.setAttribute("Student", stu);
		
		return"redirect:/ex22/sub06";
	}
	
	@RequestMapping("sub06")
	public void method6(HttpSession s) {
		Student student = (Student) s.getAttribute("Student");
		System.out.println(student);
	}
	
	
	// RedirectAttributes로 객체 넘기기
	@RequestMapping("sub07")
	public String method7(RedirectAttributes rttr) {
		Student student = new Student();
		student.setName("lee");
		student.setClassName("spring");
		student.setStudentNumber("99");
		
		rttr.addFlashAttribute("student", student);
		
		return "redirect:/ex22/sub08";
	}
	
	@RequestMapping("sub08")
	public void method8(Student student) {
		System.out.println(student);
	}
	
	@RequestMapping("sub09")
	public String method9(RedirectAttributes rttr) {
		JavaBean01 javb = new JavaBean01();
		javb.setName("kim");
		javb.setAddress("napoli");
		javb.setEmail("defender");
		
		rttr.addFlashAttribute("javaBean01", javb); // 세션을 통해서 객체를 넘기고 싶을때 가능한 메소드
		return "redirect://ex22/sub10";
		
	}
	
	@RequestMapping("sub10")
	public void  method10(JavaBean01 javb) {
		System.out.println(javb);
	}
}
