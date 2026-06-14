package com.omkar.resumeanalyzer1.service;

import org.springframework.stereotype.Service;

@Service
public class AtsCalculatorService {

    public int calculateScore(String text) {

        int score = 0;

        text = text.toLowerCase();

        if(text.contains("java")) score += 10;
        if(text.contains("spring")) score += 10;
        if(text.contains("mysql")) score += 10;
        if(text.contains("html")) score += 10;
        if(text.contains("css")) score += 10;
        if(text.contains("javascript")) score += 10;
        if(text.contains("hibernate")) score += 10;
        if(text.contains("rest api")) score += 10;
        if(text.contains("git")) score += 10;
        if(text.contains("github")) score += 10;

        return score;
    }
}