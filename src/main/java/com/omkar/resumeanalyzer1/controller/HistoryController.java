package com.omkar.resumeanalyzer1.controller;

import com.omkar.resumeanalyzer1.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {

    @Autowired
    private ResumeRepository repository;

    @GetMapping("/history")
    public String history(Model model) {

        model.addAttribute(
                "resumes",
                repository.findAll());

        return "history";
    }
}