package com.omkar.resumeanalyzer1.service;

import org.springframework.stereotype.Service;

@Service
public class ResumeAnalyzerService {

    public String analyzeResume(String resumeText) {

        String text = resumeText.toLowerCase();

        int score = 0;

        StringBuilder found = new StringBuilder();
        StringBuilder missing = new StringBuilder();

        String[] skills = {
            "java",
            "spring",
            "mysql",
            "html",
            "css",
            "javascript",
            "hibernate",
            "rest api",
            "git",
            "github"
        };

        for(String skill : skills){

            if(text.contains(skill)){

                found.append("✓ ")
                     .append(skill.toUpperCase())
                     .append("<br>");

                score += 10;
            }
            else{

                missing.append("✗ ")
                       .append(skill.toUpperCase())
                       .append("<br>");
            }
        }

        String recommendation;

        if(score >= 80){
            recommendation =
                    "Excellent Resume. Add missing technologies to reach 100 ATS score.";
        }
        else if(score >= 60){
            recommendation =
                    "Good Resume. Add more technical skills and projects.";
        }
        else{
            recommendation =
                    "Resume needs improvement. Add skills, certifications and projects.";
        }

        StringBuilder result = new StringBuilder();

        result.append("<h2>Resume Analysis Result</h2>");

        result.append("<h3>Skills Found</h3>");
        result.append(found);

        result.append("<h3>Missing Skills</h3>");
        result.append(missing);

        result.append("<h3>ATS Score : ")
              .append(score)
              .append("/100</h3>");

        result.append("<h3>Recommendation</h3>");
        result.append(recommendation);

        return result.toString();
    }
}