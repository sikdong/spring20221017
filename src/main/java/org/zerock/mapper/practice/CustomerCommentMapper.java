package org.zerock.mapper.practice;

import java.util.List;

import org.zerock.domain.practice.CommentDto;

public interface CustomerCommentMapper {

	public int enrollComment(CommentDto comment);

	public List<CommentDto> showComment(int customerInfoId);

	public int removeComment(int id);

}
