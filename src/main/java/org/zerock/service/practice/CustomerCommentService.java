package org.zerock.service.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.mapper.practice.CustomerCommentMapper;

@Service
public class CustomerCommentService {

	@Autowired
	private CustomerCommentMapper mapper;
	
	public int enrollComment() {
		// TODO Auto-generated method stub
		return mapper.enrollComment();
	}

}
