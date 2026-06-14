package com.omkar.resumeanalyzer1.controller;


import com.omkar.resumeanalyzer1.model.User;
import com.omkar.resumeanalyzer1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    UserRepository repo;

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {

        repo.save(user);

        return "redirect:/login";
    }

    @GetMapping("/login")
public String showLogin() {
    return "login";
}

@PostMapping("/login")
public String processLogin() {
    return "redirect:/upload";
}
}