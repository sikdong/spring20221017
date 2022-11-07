package org.zerock.mapper.practice;

import java.util.List;

import org.zerock.domain.practice.CustomerDto;

public interface CustomerMapper {
	public List<CustomerDto> show(int start, int end);
	
	public int register(CustomerDto customer);
	
	CustomerDto showCustomer(int id);
	
	public int deleteCustomer(int id);
	
	int updateCustomer(CustomerDto customer);

	int countAll();
}
