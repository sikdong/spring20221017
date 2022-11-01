package org.zerock.mapper.practice;

import java.util.List;

import org.zerock.domain.practice.CustomerDto;

public interface CustomerMapper {
	public List<CustomerDto> show();
	
	public int register(CustomerDto customer);
	
	CustomerDto showCustomer(int id);
}
