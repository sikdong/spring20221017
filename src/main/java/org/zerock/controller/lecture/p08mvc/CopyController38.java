package org.zerock.controller.lecture.p08mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.lecture.CopyService01;

@Controller
@RequestMapping("copyex38")
public class CopyController38 {
	
	@Autowired
	private CopyService01 service;
	
	@RequestMapping("sub01")
	public void method1() {
		service.transferMoney();
	}

}
