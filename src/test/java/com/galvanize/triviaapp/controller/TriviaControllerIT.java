package com.galvanize.triviaapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class TriviaControllerIT {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getAllQuestions_returnQuestionDetails() throws Exception {
        mockMvc.perform(get("/questions"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.questions.length()").value(2))
                .andExpect(jsonPath("$.questions[0].id").exists())
                .andExpect(jsonPath("$.questions[0].createdAt").exists())
                .andExpect(jsonPath("$.questions[0].question").exists())
                .andExpect(jsonPath("$.questions[0].answers").exists())
                .andExpect(jsonPath("$.questions[0].questionNumber").exists())
                .andExpect(jsonPath("$.questions[0].quizId").exists())
                .andExpect(jsonPath("$.questions[0].answers.length()").value(3))
                .andExpect(jsonPath("$.questions[0].answers[0].text").exists())
                .andExpect(jsonPath("$.questions[0].answers[0].correct").exists())
                .andExpect(jsonPath("$.questions[0].answers[0].choice").exists());

    }
}
