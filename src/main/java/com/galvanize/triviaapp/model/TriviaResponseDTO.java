package com.galvanize.triviaapp.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TriviaResponseDTO {
    private List<QuestionDTO> questions;

    public TriviaResponseDTO() {
        questions = new ArrayList<>();
    }
}
