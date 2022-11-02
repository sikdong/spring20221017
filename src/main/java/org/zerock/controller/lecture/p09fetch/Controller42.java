package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex42")
public class Controller42 {
	
		@RequestMapping("sub")
		public void method0(){
			
		}
		
		@RequestMapping(path = "sub01", produces ="text/plain")
		public void method1() {
			System.out.println("일함");
		}
		
		@RequestMapping(path = "sub01", produces ="text/html")
		public void method2() {
			System.out.println("이함");
		}
}
