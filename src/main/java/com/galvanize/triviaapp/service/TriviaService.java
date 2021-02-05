package com.galvanize.triviaapp.service;

import com.galvanize.triviaapp.entity.QuestionEntity;
import com.galvanize.triviaapp.model.QuestionDTO;
import com.galvanize.triviaapp.model.TriviaResponseDTO;
import com.galvanize.triviaapp.repository.QuestionRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class TriviaService {

	private QuestionRepository questionRepository;

	public TriviaResponseDTO getAllQuestions() {
		List<QuestionEntity> allQuestions = questionRepository.findAll();
		List<QuestionDTO> questions = allQuestions.stream().filter(Objects::nonNull).map(QuestionDTO::new)
				.collect(Collectors.toList());
		return new TriviaResponseDTO(questions);
	}
}
