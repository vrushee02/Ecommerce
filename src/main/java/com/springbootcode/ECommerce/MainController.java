/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcode.ECommerce;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.example.Furnistar.service.UserInfoService;

@Controller
public class MainController {

	@Autowired
	private UserInfoService userservice;
	
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping("/home")
	public String ind() {
		return "index.html";
	}
	
/*	@RequestMapping("/logins")
	public String login() {
		return "SignUp.html"; 	}*/
	
	 @RequestMapping(value = "/registration" , method = RequestMethod.GET) 
	 public String loginpage(Model model)
	 {
		  
		  System.out.println("login page");
		  return "SignUp.html";
		  
	 }
	 
	 /********************Save User Registratio
     * @return n*********************/
	 
	 @ModelAttribute("savedata")
		public UserInfo load()
		{
			return new UserInfo();
		}
		
	 
	 @PostMapping("/signup")
		public String dataSave(@ModelAttribute("savedata") UserInfo userinfo)
		{
			System.out.println("name"+userinfo.getFirstname()+" "+userinfo.getMiddlename()+" "+userinfo.getLastname()+" "+userinfo.getEmail()+" "+userinfo.getPassword());
			userservice.saveData(userinfo);
			System.out.println("after saving data");
			return "index";
			
		}
	 
}



