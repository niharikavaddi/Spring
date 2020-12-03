package com.controller;

import javax.validation.Valid;
import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SecondController {
	@GetMapping(value = "/one")
	public String one(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "hello";
		} else {

		}
		return "redirect:/two";
	}

	@GetMapping(value = "/two")
	public String two() {
		System.out.println("hello two");
		return "hello";
	}
}
