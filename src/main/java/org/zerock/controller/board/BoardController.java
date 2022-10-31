package org.zerock.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.board.BoardDto;
import org.zerock.service.board.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	@GetMapping("register")
	public void register() {
		// 게시물 작성 view 로 포워드
	}
	
	@PostMapping("register")
	public String register(BoardDto board, RedirectAttributes rttr){
		                // 디스패쳐 서블릿이 알아서 넣어주기때문에 인수로만 받으면 됨
		//request param 수집/ 가공
		
		//business 로직 
		int cnt = service.register(board);
		if(cnt == 1) {
			rttr.addFlashAttribute("message", "새 게시물이 등록되었습니다.");
			} else {
			rttr.addFlashAttribute("message", "새 게시물이 등록되지 않았습니다. ");
		}
		
		// /board/list 로 리다이렉트
		
		return "redirect:/board/list";
	}
	
	@GetMapping("list")
	public void list(Model model) {
		
		List<BoardDto>list = service.listBoard();
		model.addAttribute("boardList", list);
	}
	
	@GetMapping("get")
	public void get(Model model, int id) {
		BoardDto board = service.get(id);
		model.addAttribute("board", board);
	}
	
	@GetMapping("modify")
	public void modify(int id, Model model) {
		BoardDto board = service.get(id);
		model.addAttribute("board", board);
	}
	
	@PostMapping("modify")
	public String modify(BoardDto board, RedirectAttributes rttr) {
		int cnt = service.update(board);
		if(cnt == 1) {
			rttr.addFlashAttribute("message", board.getId() +"번 게시물이 수정되었습니다");
		} else {
			rttr.addFlashAttribute("message", board.getId() +"번 게시물이 수정되지 않았습니다");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("remove")
	public String remove(Integer id, RedirectAttributes rttr) {
		int cnt = service.remove(id);
		if(cnt == 1) {
			rttr.addFlashAttribute("deletemessage", "게시물이 삭제되었습니다");
		} else {
			rttr.addFlashAttribute("deletemessage", "게시물이 삭제되지 못했습니다.");
		}
		return"redirect:/board/list";
	}
}
