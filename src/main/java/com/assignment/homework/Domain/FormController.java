package com.assignment.homework.Domain;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormController {
    @GetMapping("/info")
    public String showForm(Model model) {        
        model.addAttribute("user", new User());
        return "info";
    }

    @PostMapping("/info")
	// public String formSubmit(@ModelAttribute User user, Model model) {
	// 	model.addAttribute("User", user);
	// 	return "form_success";
    // }
    public String formSubmit(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "success";
    }
    
}