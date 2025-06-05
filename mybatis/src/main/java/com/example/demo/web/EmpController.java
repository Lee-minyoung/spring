package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.EmpService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
 public class EmpController {
	private final EmpService empService;
	
	@GetMapping("/emp")
	public String getMethodName(Model model){
		model.addAttribute("empList", empService.getEmp());
		return "emp";
   
  
    }
 }