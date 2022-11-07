package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.ReplyDto;
import org.zerock.mapper.board.ReplyMapper;

@Service
public class ReplyService {

	@Autowired
	private ReplyMapper mapper;
	
	public int addReply(ReplyDto reply) {
		// TODO Auto-generated method stub
		return mapper.insert(reply);
	}

	public List<ReplyDto> listReplyByBoardId(int boardId) {
		// TODO Auto-generated method stub
		return mapper.selectReplyByBoardId(boardId);
	}

	public int removeById(int id) {
		// TODO Auto-generated method stub
		return mapper.deleteById(id);
	}

	public ReplyDto getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	public int modify(ReplyDto reply) {
		// TODO Auto-generated method stub
		return mapper.update(reply);
	}
	
}
