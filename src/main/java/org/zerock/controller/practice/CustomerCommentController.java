package org.zerock.controller.practice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.practice.CommentDto;
import org.zerock.service.practice.CustomerCommentService;

@Controller
@RequestMapping("comment")
public class CustomerCommentController {

	
	 @Autowired 
	 private CustomerCommentService service;
	 
	@PostMapping("enroll")
	@ResponseBody
	public Map<String, Object> method1(@RequestBody CommentDto comment){
	// json형식으로 넘어갔으니까 받을 객체가 있어야 함	
	Map<String, Object> map = new HashMap<String, Object>();
	int cnt = service.enrollComment(comment);
	
	if(cnt == 1) {
		map.put("message", "새 댓글이 등록되었습니다");
		} else {
			map.put("message", "새 댓글 등록 X");
		}
	return map;
	}
	
}	
