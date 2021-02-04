package com.galvanize.triviaapp.controller;

import com.galvanize.triviaapp.entity.AnswerEntity;
import com.galvanize.triviaapp.entity.QuestionEntity;
import com.galvanize.triviaapp.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(properties = "application-test.properties")
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class TriviaControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private QuestionRepository questionRepository;



    @Test
    public void getAllQuestions_returnEmptyList_whenNoQuestionFound() throws Exception {
        questionRepository.deleteAll();
        mockMvc.perform(get("/questions"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.questions.length()").value(0));
    }

    @Test
    public void getAllQuestions_returnQuestionDetails() throws Exception {
//        prepareData();
        mockMvc.perform(get("/questions"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.questions.length()").value(2));

    }

//    private void prepareData() {
//        AnswerEntity ans1 = AnswerEntity.builder()
//                .id(1)
//                .choice("A")
//                .correct(true)
//                .text("answer 1")
//                .build();
//
//        AnswerEntity ans2 = AnswerEntity.builder()
//                .id(2)
//                .choice("B")
//                .correct(false)
//                .text("answer 2")
//                .build();
//
//        QuestionEntity questionEntity = QuestionEntity.builder()
//                .id(1)
//                .quizId(1)
//                .question("Question 1")
//                .questionNumber(2)
//    }
}
