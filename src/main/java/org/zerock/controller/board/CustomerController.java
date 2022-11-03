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
import org.zerock.domain.practice.CustomerDto;
import org.zerock.domain.practice.PageButtonInfo;
import org.zerock.service.practice.CustomerService;

@Controller
@RequestMapping("practice")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("list")
	public void showBoard(Model model, @RequestParam(name="page", 
	defaultValue="1") int page, PageButtonInfo pageButtonInfo) {
		List<CustomerDto> list = service.showList(page, pageButtonInfo);
		model.addAttribute("showList", list);
	}
	
	@GetMapping("register")
	public void register() {
		
	}
	
	@PostMapping("register")
	public void register(CustomerDto customer) {
		service.register(customer);
	}
	
	@GetMapping("show")
	public void showCustomer(int id, Model model) {
		CustomerDto customer = service.showCustomer(id);
		model.addAttribute("customerList", customer);
	}
	
	@PostMapping("delete")
	public String deleteCustomer(int id, RedirectAttributes rttr) {
		int cnt = service.deleteCustomer(id);
		if(cnt == 1) {
			
		rttr.addFlashAttribute("message", "id + '번 고객 정보가 삭제 되었습니다'");
		}
		return "redirect:/practice/list";
	}
}
