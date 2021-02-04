package com.galvanize.triviaapp.service;

import com.galvanize.triviaapp.model.TriviaResponseDTO;
import com.galvanize.triviaapp.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TriviaService {

    private QuestionRepository questionRepository;

    public TriviaResponseDTO getAllQuestions() {
        return new TriviaResponseDTO();
    }
}
