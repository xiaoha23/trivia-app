package com.galvanize.triviaapp;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class TriviaAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getAllQuestions_returnQuestionDetails() throws Exception {
		mockMvc.perform(get("/questions")).andExpect(status().isOk())
				.andExpect(jsonPath("$.content", hasSize(greaterThan(1))))
				.andExpect(jsonPath("$.content[0].id").doesNotExist())
				.andExpect(jsonPath("$.content[0].timestamp").exists())
				.andExpect(jsonPath("$.content[0].question").exists())
				.andExpect(jsonPath("$.content[0].answers").exists())
				.andExpect(jsonPath("$.content[0].questionNumber").exists())
				.andExpect(jsonPath("$.content[0].quizId").exists())
				.andExpect(jsonPath("$.content[0].answers.length()").value(3))
				.andExpect(jsonPath("$.content[0].answers[0].text").exists())
				.andExpect(jsonPath("$.content[0].answers[0].correct").exists())
				.andExpect(jsonPath("$.content[0].answers[0].choice").exists());

	}

	@Test
	public void getAllQuestions_returnRandomQuizSet() throws Exception {
		mockMvc.perform(get("/quiz")).andExpect(status().isOk())
				.andExpect(jsonPath("$.content", hasSize(greaterThan(9))))
				.andExpect(jsonPath("$.content[0].id").doesNotExist())
				.andExpect(jsonPath("$.content[0].timestamp").exists())
				.andExpect(jsonPath("$.content[0].question").exists())
				.andExpect(jsonPath("$.content[0].answers").exists())
				.andExpect(jsonPath("$.content[0].questionNumber").exists())
				.andExpect(jsonPath("$.content[0].quizId").exists())
				.andExpect(jsonPath("$.content[0].answers.length()").value(3))
				.andExpect(jsonPath("$.content[0].answers[0].text").exists())
				.andExpect(jsonPath("$.content[0].answers[0].correct").exists())
				.andExpect(jsonPath("$.content[0].answers[0].choice").exists());

	}

}
