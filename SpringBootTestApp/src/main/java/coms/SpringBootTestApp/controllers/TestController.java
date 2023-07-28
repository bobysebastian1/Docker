package coms.SpringBootTestApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping(value="/p1")
	//@RequestMapping(value="/p1", method=RequestMethod.GET)
	public String DemoPage1(Model m)
	{
		m.addAttribute("msg", "Hi, User");
		return "Page1";
	}
	
	@GetMapping(value="/p2")
	public String DemoPage2(Model m)
	{
		m.addAttribute("msg", "Please check username/password");
		return "Page2";
	}
	
	@GetMapping(value="/login")
	public String LoginPage(Model m)
	{
		return "Login";
	}
	
	@PostMapping(value="/loginprocess")
	public String LoginPage(@RequestParam("txtUser") String uname, 
			@RequestParam("txtPwd") String pwd,
			Model m)
	{
		if(uname.equals("Murali") && pwd.equals("12345"))
			return "redirect:/p1";

		else
			return "redirect:/p2";
		//return "Login";
	}
}