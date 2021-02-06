package com.galvanize.triviaapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.galvanize.triviaapp.entity.QuestionEntity;
import com.galvanize.triviaapp.model.TriviaResponseDTO;
import com.galvanize.triviaapp.repository.QuestionRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TriviaService {

	private QuestionRepository questionRepository;

	public TriviaResponseDTO getAllQuestionsForRandomQuiz() {
		List<QuestionEntity> allQuestions = questionRepository.findQuestionsQuizId();
		return new TriviaResponseDTO(allQuestions);
	}
}
