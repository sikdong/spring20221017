package org.zerock.controller.board;

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
		int cnt = service.enrollComment();
		if(cnt == 1){
			
		}
	}
}
