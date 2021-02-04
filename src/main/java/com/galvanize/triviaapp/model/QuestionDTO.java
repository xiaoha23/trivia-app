package com.galvanize.triviaapp.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class QuestionDTO {
    private Integer id;
    private Date createdAt;
    private String question;
    private List<AnswerDTO> answers;
    private Integer questionNumber;
    private Integer quizId;
}
