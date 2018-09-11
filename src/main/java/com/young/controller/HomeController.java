package com.young.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.young.repository.StudentRepository;

@Controller
public class HomeController {
	
	
	private StudentRepository sr1;
	
	@Autowired 
	public HomeController(StudentRepository sr1) {
		super();
		this.sr1 = sr1;
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/studentList")
	public String studentList(Model model) {
		model.addAttribute("studentList",sr1.getStudentList(20));
		return "studentList";
	}
	

}
