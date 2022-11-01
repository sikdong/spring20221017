package org.zerock.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.practice.CustomerDto;
import org.zerock.service.practice.CustomerService;

@Controller
@RequestMapping("practice")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("list")
	public void showBoard(Model model) {
		List<CustomerDto> list = service.showList();
		model.addAttribute("showList", list);
	}
	
	@GetMapping("register")
	public void register() {
		
	}
	
	@PostMapping("register")
	public void register(CustomerDto customer) {
		service.register(customer);
	}
}
