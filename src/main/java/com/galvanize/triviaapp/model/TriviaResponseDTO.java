package com.galvanize.triviaapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class TriviaResponseDTO {
    private List<QuestionDTO> questions;

    public TriviaResponseDTO() {
        questions = new ArrayList<>();
    }
}
