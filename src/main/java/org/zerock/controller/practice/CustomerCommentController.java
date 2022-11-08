package org.zerock.controller.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.practice.CommentDto;
import org.zerock.service.practice.CustomerCommentService;

@Controller
@RequestMapping("comment")
public class CustomerCommentController {

	
	 @Autowired 
	 private CustomerCommentService service;
	 
	@PostMapping("enroll")
	public void method1(@RequestBody CommentDto comment){
	// json형식으로 넘어갔으니까 받을 객체가 있어야 함	
	int cnt = service.enrollComment();
		if(cnt == 1){
			
		}
	}
}
