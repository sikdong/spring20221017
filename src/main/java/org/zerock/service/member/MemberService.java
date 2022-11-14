package org.zerock.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.member.MemberDto;
import org.zerock.mapper.member.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper mapper;

	public int insert(MemberDto member) {
		// TODO Auto-generated method stub
		return mapper.insert(member);
	}

	public List<MemberDto> list() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public MemberDto showMemberInfo(String id) {
		// TODO Auto-generated method stub
		return mapper.showMemberInfo(id);
	}

	public int modifyMemberInfo(MemberDto member) {
		// TODO Auto-generated method stub
		return mapper.updateMemberInfo(member);
		
	}

	public int remove(String id) {
		// TODO Auto-generated method stub
		return mapper.deleteMember(id);
	}


	public MemberDto getByEmail(String email) {
		// TODO Auto-generated method stub
		return mapper.selectByEmail(email);
	}
	
	
}
