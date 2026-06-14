package com.omkar.resumeanalyzer1.controller;

import com.omkar.resumeanalyzer1.service.PdfService;
import com.omkar.resumeanalyzer1.service.ResumeAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ResumeController {

    @Autowired
    private PdfService pdfService;

    @Autowired
    private ResumeAnalyzerService analyzerService;

    @GetMapping("/upload")
    public String uploadPage() {
        return "upload";
    }

    @PostMapping("/analyze")
    public String analyzeResume(
            @RequestParam("resumeFile") MultipartFile file,
            Model model) {

        try {

            String resumeText = pdfService.extractText(file);

            String result =
                    analyzerService.analyzeResume(resumeText);

            model.addAttribute("result", result);

            return "result";

        } catch (Exception e) {

            model.addAttribute(
                    "result",
                    "Error while analyzing resume: "
                    + e.getMessage());

            return "result";
        }
    }
}