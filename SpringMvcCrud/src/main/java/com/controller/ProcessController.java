package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exception.CustomException;
import com.model.User;
import com.service.UserCrud;

@Controller
public class ProcessController {
	@Autowired
	private UserCrud userCrud;

	@GetMapping(value = "/welcome")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "clientside";
	}

	@GetMapping(value = "/choicecheck")
	public ModelAndView choiceCheck(@RequestParam("radios") String choice, @ModelAttribute("user") User user) {
		ModelAndView modelAndView = null;
		switch (choice) {
		case "create":
			try {
				userCrud.createUser(user);
				modelAndView = new ModelAndView("success");
				modelAndView.addObject("message", "User Creation Successfull");
			} catch (CustomException ce) {
				modelAndView = new ModelAndView("error");
				modelAndView.addObject("message", ce.getMessage());
			}
			break;
		case "update":
			try {
				if (userCrud.readUser(user.getUsername()) != null) {
					modelAndView = new ModelAndView("update");
					modelAndView.addObject("message", "User Updation succesfull");
				}
			} catch (CustomException ce) {
				modelAndView = new ModelAndView("error");
				modelAndView.addObject("message", ce.getMessage());
			}
			break;
		case "read":
			try {
				if (userCrud.readUser(user.getUsername()) != null) {
					modelAndView = new ModelAndView("success");
					modelAndView.addObject("message", "Reading user details succesfull");
				}
			} catch (CustomException ce) {
				modelAndView = new ModelAndView("error");
				modelAndView.addObject("message", ce.getMessage());
			}
			break;
		case "delete":
			try {
				userCrud.deleteUser(user);
				modelAndView = new ModelAndView("success");
				modelAndView.addObject("message", "User Deletion Successfull");
			} catch (CustomException ce) {
				modelAndView = new ModelAndView("error");
				modelAndView.addObject("message", ce.getMessage());
			}
			break;
		}
		return modelAndView;
	}
}
