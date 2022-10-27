package org.zerock.mapper.lecture;

import java.util.List;

public interface Mapper09 {
	String getCustomerNameById(int id);
	String getEmployeeFirstNameById(int empid);
	List<String> getCustomerNameByCityAndCountry(String city, String country);
}
