package com.galvanize.triviaapp.model;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.galvanize.triviaapp.entity.QuestionEntity;

@Data
public class QuestionDTO {
	private Integer id;
	private Date createdAt;
	private String question;
	private List<AnswerDTO> answers;
	private Integer questionNumber;
	private Integer quizId;

	public QuestionDTO(QuestionEntity entity) {
		BeanUtils.copyProperties(entity, this);
		if(Objects.nonNull(entity.getAnswers())) {
			this.answers = entity.getAnswers().stream().filter(Objects::nonNull).map(AnswerDTO::new).collect(Collectors.toList());
		}
		
	}
}
