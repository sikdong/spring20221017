package org.zerock.mapper.member;

import java.util.List;

import org.zerock.domain.member.MemberDto;

public interface MemberMapper {

	int insert(MemberDto member);

	List<MemberDto> selectAll();

	MemberDto showMemberInfo(String id);

	int updateMemberInfo(MemberDto member);

	int deleteMember(String id);

	MemberDto selectByEmail(String email);

}
