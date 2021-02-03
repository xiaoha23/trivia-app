package com.galvanize.triviaapp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionsDTO {
    private List<String> questions;

    public QuestionsDTO() {
        questions = new ArrayList<>();
    }
}
