package org.zerock.service.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zerock.domain.practice.CustomerDto;
import org.zerock.domain.practice.PageButtonInfo;
import org.zerock.mapper.practice.CustomerMapper;

@Service
public class CustomerService {

	@Autowired
	private CustomerMapper mapper;
	
	public List<CustomerDto> showList(int page, PageButtonInfo pageButtonInfo){
		int end = 10;
		int start = (page - 1) * end;
		
		double leftPageNumber = Math.max(1, page-3);
		double rightPageNumber = Math.min(10,leftPageNumber + 5);
		
		pageButtonInfo.setLeftPageNumber(leftPageNumber);
		pageButtonInfo.setRightPageNumber(rightPageNumber);
		pageButtonInfo.setCurrentPageNumber(page);
		
		
		return mapper.show(start, end);
	}
	
	public int register(CustomerDto customer) {
		return mapper.register(customer);
	}
	
	public CustomerDto showCustomer(int id) {
		return mapper.showCustomer(id);
	}
	
	public int deleteCustomer(int id) {
		return mapper.deleteCustomer(id);
	}
	public int updateCustomer(CustomerDto customer) {
		return mapper.updateCustomer(customer);
	}
}
