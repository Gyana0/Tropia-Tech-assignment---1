package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.dto.UserData;
import com.crud.entity.User;
import com.crud.service.UserService;




@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	// http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateUserpage() {
		return "create_user";
	}
	
	@RequestMapping("/saveUser")
	public String saveOneLead(@ModelAttribute("l")User user, ModelMap model) {
		userService.saveUserInfo(user);
		model.addAttribute("msg","Record saved..!!");
		return "create_user";
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(Model model) {
		List<User> users = userService.getAllUsers();
		model.addAttribute("user", users);
		return "list_users";
	}
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") Long id, Model model) {
		userService.deleteUser(id);
		List<User> users = userService.getAllUsers();
		model.addAttribute("user", users);
		model.addAttribute("msg", "Record successfully deleted..!!");
		return "list_users";
		
	}
	
	@RequestMapping("/update")
	public String getOneLead(@RequestParam("id") Long id, Model model) {
		
		User user = userService.getOneLeadInfo(id);
		
		model.addAttribute("user", user);
		return "update_user";
	}
	
	
	@RequestMapping("/updateLead")
	public String updateOneLead(UserData data, Model model) {
		User user = new User();
		user.setId(data.getId());
		user.setFirstName(data.getFirstName());
		user.setLastName(data.getLastName());
		user.setDateOfBirth(data.getDateOfBirth());
		user.setUsername(data.getUsername());
		user.setEmail(data.getEmail());
		
		userService.saveUserInfo(user);
		
		List<User> leads = userService.getAllUsers();
		model.addAttribute("leads", leads);
		model.addAttribute("msg", "Record successfully updated..!!");
		return "list_leads";
	}
}
