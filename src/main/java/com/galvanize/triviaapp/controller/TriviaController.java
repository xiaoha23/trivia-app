package com.galvanize.triviaapp.controller;

import com.galvanize.triviaapp.QuestionsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class TriviaController {

    @GetMapping
    public QuestionsDTO getAllQuestions() {
        return new QuestionsDTO();
    }
}
