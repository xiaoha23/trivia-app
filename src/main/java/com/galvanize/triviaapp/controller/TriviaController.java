package com.galvanize.triviaapp.controller;

import com.galvanize.triviaapp.model.TriviaResponseDTO;
import com.galvanize.triviaapp.service.TriviaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TriviaController {

    private TriviaService triviaService;


    @GetMapping("/quiz")
    public TriviaResponseDTO getAllQuestionsForRandomQuiz() {
        return triviaService.getAllQuestionsForRandomQuiz();
    }
}
