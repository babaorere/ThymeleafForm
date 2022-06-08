package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapp.models.Greeting;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(final Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute final Greeting greeting, final Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

}