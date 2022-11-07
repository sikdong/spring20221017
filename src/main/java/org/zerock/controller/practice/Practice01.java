package org.zerock.controller.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("practice")
public class Practice01 {
	@Autowired
	private Mapper11 mapper;
	
	@RequestMapping("sub")
	public void method0() {
		
	}
	
	@GetMapping("sub01")
	@ResponseBody
	public Map<String, String> method1(){
		return Map.of("address","seoul","name","손흥민","job","soccer player");
	}
	
	@GetMapping("sub03")
	@ResponseBody
	public Map<String, Object> method3() {
		return Map.of("color", List.of("blue","red"), "model",5, "location","usa");
	}
	
	@GetMapping("sub04")
	@ResponseBody
	public JavaBean18 method4() {
		return mapper.getCustomerById(30);
	}
	
	@GetMapping("sub05")
	@ResponseBody
	public JavaBean19 method5() {
		return mapper.getSupplierByName("Exotic Liquid");
	}
	
	@GetMapping("sub07/{id}")
	@ResponseBody
	public JavaBean19 method7(@PathVariable String name) {
		return mapper.getSupplierByName(name);
	}
	
	@GetMapping("sub08/{id}")
	@ResponseBody
	public Map<String, Object> method8(@PathVariable int id) {
		Map<String, Object> map = new HashMap<>();
		
		JavaBean18 customer = mapper.getCustomerById(id);
		
		if (customer != null) {
			map.put("customer", customer);
			map.put("message", "조회 완료되었습니다.");
		} else {
			map.put("message", "조회되지 않았습니다.");
		}
		
		return map;
	}
	
	@GetMapping("sub09/{name}")
	@ResponseBody
	public Map<String, Object> method9(@PathVariable String name){
		Map<String, Object> map = new HashMap<>();
		
		JavaBean19 supplier = mapper.getSupplierByName(name);
		
		map.put("supplier", supplier);
		return map;
	}
	
	@PutMapping("sub11")
	@ResponseBody
	public Map<String, Object> method11(@RequestBody JavaBean19 supplier){
		Map<String, Object> map = new HashMap<String, Object>();
		int cnt = mapper.updateSupplier(supplier);
		
		if(cnt == 1) {
			map.put("supplier", supplier);
			map.put("message", supplier.getId()+"번 공급자 정보가 변경 되었습니다");
		} else {
			map.put("message", "공급자 정보가 변경되지 않았습니다");
		}
		return map;
	}
	
	@PostMapping("sub13")
	@ResponseBody
	public Map<String, String> method12(@RequestBody JavaBean19 supplier) {
		Map<String, String> map = new HashMap<>();
		int cnt = mapper.insertSupplier(supplier);
		if (cnt == 1) {
			map.put("message", supplier.getId() + "번 공급자 정보가 입력되었습니다.");
		} else {
			map.put("message", "공급자 정보가 입력되지 않았습니다.");
		}
		
		return map;
	}
	
	@DeleteMapping("sub14/{id}")
	@ResponseBody
	public Map<String, String> method12(@PathVariable int id) {
		Map<String, String> map = new HashMap<>();
		int cnt = mapper.deleteSupplier(id);
		if (cnt == 1) {
			map.put("message", id + "번 공급자 정보가 삭제되었습니다.");
		} else {
			map.put("message", "공급자 정보가 삭제되지 않았습니다.");
		}
		
		return map;
	}
}	
