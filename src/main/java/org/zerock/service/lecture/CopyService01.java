package org.zerock.service.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.mapper.lecture.CopyMapper11;

@Service
public class CopyService01 {

	@Autowired
	private CopyMapper11 mapper;
	
	@Transactional
	public void transferMoney() {
		mapper.updateBank(2, -1000);
		mapper.updateBank(1, 1000);
	}
}
