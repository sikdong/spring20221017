package org.zerock.service.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.practice.CustomerDto;
import org.zerock.mapper.practice.CustomerMapper;

@Service
public class CustomerService {

	@Autowired
	private CustomerMapper mapper;
	
	public List<CustomerDto> showList(int page){
		
		int end = 10;
		int start = (page - 1) * end;
		
		return mapper.show();
	}
	
	public int register(CustomerDto customer) {
		return mapper.register(customer);
	}
	
	public CustomerDto showCustomer(int id) {
		return mapper.showCustomer(id);
	}
}
