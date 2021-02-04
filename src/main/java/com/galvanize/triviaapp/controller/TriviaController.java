package com.galvanize.triviaapp.controller;

import com.galvanize.triviaapp.model.TriviaResponseDTO;
import com.galvanize.triviaapp.service.TriviaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
@AllArgsConstructor
public class TriviaController {

    private TriviaService triviaService;


    @GetMapping
    public TriviaResponseDTO getAllQuestions() {
        return triviaService.getAllQuestions();
    }
}
