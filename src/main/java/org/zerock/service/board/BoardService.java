package org.zerock.service.board;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
import org.zerock.mapper.board.BoardMapper;
import org.zerock.mapper.board.ReplyMapper;


@Service
@Transactional
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Autowired
	private ReplyMapper replyMapper;
	
	@Transactional
	public int register(BoardDto board, MultipartFile[] files) {
		
		int cnt =  boardMapper.insert(board);
		
		for(MultipartFile file : files) {
		
		if (files != null && file.getSize() > 0) {
			// db에 파일 정보 저장
			boardMapper.insertFile(board.getId(), file.getOriginalFilename());

			// 파일 저장
			
			//board id 이름의 새폴더 만들기
			File folder = new File("C:\\Users\\user\\Desktop\\Study\\upload\\prj1\\board\\" + board.getId());
			folder.mkdirs();
			
			File dest = new File(folder, file.getOriginalFilename());
			try {
				file.transferTo(dest);			
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}

			}
		}
		return cnt;
	
	}

	public List<BoardDto> listBoard(int page, String type, String keyword, PageInfo pageInfo) {
		int records = 10;
		int offset = (page - 1) * records;
		
		int countAll = boardMapper.countAll(type, "%" + keyword + "%"); // SELECT Count(*) FROM Board
		int lastPage = (countAll - 1) / records + 1;
		
		int leftPageNumber = (page - 1) / 10 * 10 + 1;
		int rightPageNumber = leftPageNumber + 9;
		rightPageNumber = Math.min(rightPageNumber, lastPage);
		
		// 이전버튼 유무
		boolean hasPrevButton = page > 10;
		// 다음버튼 유무
		boolean hasNextButton = page <= ((lastPage - 1) / 10 * 10);
		
		// 이전버튼 눌렀을 때 가는 페이지 번호
		int jumpPrevPageNumber = (page - 1) / 10 * 10 - 9;
		int jumpNextPageNumber = (page - 1) / 10 * 10 + 11; 
		
		pageInfo.setHasPrevButton(hasPrevButton);
		pageInfo.setHasNextButton(hasNextButton);
		pageInfo.setJumpPrevPageNumber(jumpPrevPageNumber);
		pageInfo.setJumpNextPageNumber(jumpNextPageNumber);
		pageInfo.setCurrentPageNumber(page);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		pageInfo.setLastPageNumber(lastPage);
		
		return boardMapper.list(offset, records, type, "%" + keyword + "%");
	}

	public BoardDto get(int id) {
		// TODO Auto-generated method stub
		return boardMapper.select(id);
	}
	@Transactional
	public int update(BoardDto board, MultipartFile[] files, List<String> removeFiles) {
		
		int id = board.getId();
		//removeFiles에 있는 파일명으로
		if (removeFiles != null) {
			
		for (String fileName : removeFiles) {
			// 1. File 테이블에서 record 지우기
			boardMapper.deleteFileByBoardIdAndFileName(id, fileName);
			// 2. 저장소에 실제 파일 지우기
			String path = "C:\\Users\\user\\Desktop\\study\\upload\\prj1\\board\\" + id + "\\" + fileName;
			File file = new File(path);

			file.delete();
			}
		}
		
		
		for (MultipartFile file : files) {
			if (files != null && file.getSize() > 0) {
			int boardId = board.getId();
			String name = file.getOriginalFilename();
			// File table에 해당파일명 지우기(같은 파일을 선택했을 때 중복될 수 있기 때문)
			boardMapper.deleteFileByBoardIdAndFileName(boardId, name);

			// File table에 파일명 추가
			boardMapper.insertFile(boardId, name);

			// 저장소에 실제 파일 추가
			File folder1 = new File("C:\\Users\\user\\Desktop\\study\\upload\\prj1\\board\\" + board.getId());
			folder1.mkdirs();

			File dest = new File(folder1, name);

				try {
					file.transferTo(dest);
				} catch (Exception e) {
					// @Transactional은 RuntimeException에서만 rollback 됨
					e.printStackTrace();
					throw new RuntimeException(e);
				}

			}
		}
		
		return boardMapper.update(board);	
	}

	@Transactional
	public int remove(int id) {
		// 댓글달린 게시물들은 REPLY 테이블이 BOARD 테이블의 기본키를 참조하는 관계이기 때문에
		// 댓글이 있으면 지워지지 않음
		// 게시물의 댓글들 지우기
		replyMapper.deleteByBoardId(id);
		
		// 저장소의 파일 지우기
		String path = "C:\\Users\\user\\Desktop\\Study\\upload\\prj1\\board\\"+id;
		File folder = new File(path);
		
		File[] listFiles = folder.listFiles();
		if(listFiles != null) {
			for(File file : listFiles) {
				file.delete();
			}
		folder.delete();
		}
		
		
		// db 파일 records 지우기
		boardMapper.deleteFile(id);
		
		// 게시물 지우기
		return boardMapper.delete(id);
		
	//하나의 업무로 취급해야 하기 때문(댓글 지워지고 게시물 삭제가 안되면 안됨)
	}
	
}

